package be.baddev.java_springmvc_rest_bel_aide.bll.services.donation.interfaces;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Donation;

import java.util.List;
import java.util.UUID;

public interface DonationService {

    Donation create(Donation entity);

    Donation update(Donation entity);

    Donation findById(UUID id);

    List<Donation> findAll();

    void delete(UUID id);
}