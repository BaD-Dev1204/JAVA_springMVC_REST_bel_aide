package be.baddev.java_springmvc_rest_bel_aide.bll.services.request.interfaces;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Request;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RequestService {

    Request create(Request entity);

    Request update(Request entity);

    Request findById(UUID id);

    List<Request> findAll();

    void delete(UUID id);
}