package be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.services.exchange.interfaces.ExchangeService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.ExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        return repository.save(entity);
    }

    @Override
    public Optional<Exchange> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<Exchange> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}