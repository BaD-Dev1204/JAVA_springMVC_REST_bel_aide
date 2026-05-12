package be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.interfaces;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;

import java.util.List;
import java.util.UUID;

public interface ExchangeService {

    Exchange create(Exchange entity);

    Exchange update(Exchange entity);

    Exchange findById(UUID id);

    List<Exchange> findAll();

    void delete(UUID id);
}