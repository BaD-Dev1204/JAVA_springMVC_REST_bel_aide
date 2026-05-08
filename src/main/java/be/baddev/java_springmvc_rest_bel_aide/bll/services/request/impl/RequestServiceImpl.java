package be.baddev.java_springmvc_rest_bel_aide.bll.services.request.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.services.request.interfaces.RequestService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Request;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {

    private final RequestRepository repository;

    @Override
    public Request create(Request entity) {
        return repository.save(entity);
    }

    @Override
    public Request update(Request entity) {
        return repository.save(entity);
    }

    @Override
    public Optional<Request> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<Request> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}