package be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.OperationNotAllowedException;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.interfaces.ExchangeService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.ExchangeRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExchangeServiceImpl implements ExchangeService {

    private final ExchangeRepository repository;

    @Override
    public Exchange create(Exchange entity) {

        return repository.save(entity);
    }

    @Override
    public Exchange update(Exchange entity) {

        Exchange existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new NotFoundException(
                                "Exchange not found with id: " + entity.getId()
                        )
                );

        if (existing.isFlexible() && !entity.isFlexible()) {
            throw new OperationNotAllowedException(
                    "Cannot disable flexibility once enabled"
            );
        }

        return repository.save(entity);
    }

    @Override
    public Exchange findById(UUID id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Exchange not found with id: " + id
                        )
                );
    }

    @Override
    public List<Exchange> findAll() {

        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {

        Exchange exchange = repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Exchange not found with id: " + id
                        )
                );

        if (exchange.isFlexible()) {
            throw new OperationNotAllowedException(
                    "Cannot delete a flexible exchange"
            );
        }

        repository.delete(exchange);
    }
}