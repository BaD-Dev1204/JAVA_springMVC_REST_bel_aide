package be.baddev.java_springmvc_rest_bel_aide.bll.services.donation.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.OperationNotAllowedException;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.donation.interfaces.DonationService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Donation;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.DonationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DonationServiceImpl implements DonationService {

    private final DonationRepository repository;

    @Override
    public Donation create(Donation entity) {

        return repository.save(entity);
    }

    @Override
    public Donation update(Donation entity) {

        Donation existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new NotFoundException(
                                "Donation not found with id: " + entity.getId()
                        )
                );

        if (existing.isDeliveryPossible() && !entity.isDeliveryPossible()) {
            throw new OperationNotAllowedException(
                    "Cannot disable delivery once enabled"
            );
        }

        return repository.save(entity);
    }

    @Override
    public Donation findById(UUID id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Donation not found with id: " + id
                        )
                );
    }

    @Override
    public List<Donation> findAll() {

        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {

        Donation donation = repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Donation not found with id: " + id
                        )
                );

        if (donation.isDeliveryPossible()) {
            throw new OperationNotAllowedException(
                    "Cannot delete a donation with delivery enabled"
            );
        }

        repository.delete(donation);
    }
}