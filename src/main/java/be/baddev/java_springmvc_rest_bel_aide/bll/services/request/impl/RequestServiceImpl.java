package be.baddev.java_springmvc_rest_bel_aide.bll.services.request.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.request.interfaces.RequestService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Request;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.RequestRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
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

        Request existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new NotFoundException(
                                "Request not found with id: " + entity.getId()
                        )
                );

        return repository.save(entity);
    }

    @Override
    public Request findById(UUID id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Request not found with id: " + id
                        )
                );
    }

    @Override
    public List<Request> findAll() {

        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {

        Request request = repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Request not found with id: " + id
                        )
                );

        repository.delete(request);
    }
}