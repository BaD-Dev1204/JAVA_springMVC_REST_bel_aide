package be.baddev.java_springmvc_rest_bel_aide.bll.services.post.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.bll.exceptions.OperationNotAllowedException;
import be.baddev.java_springmvc_rest_bel_aide.bll.services.post.interfaces.PostService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Post;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.PostRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository repository;

    @Override
    public Post create(Post entity) {

        return repository.save(entity);
    }

    @Override
    public Post update(Post entity) {

        Post existing = repository.findById(entity.getId())
                .orElseThrow(() ->
                        new NotFoundException(
                                "Post not found with id: " + entity.getId()
                        )
                );

        return repository.save(entity);
    }

    @Override
    public Post findById(UUID id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Post not found with id: " + id
                        )
                );
    }

    @Override
    public List<Post> findAll() {

        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {

        Post post = repository.findById(id)
                .orElseThrow(() ->
                        new NotFoundException(
                                "Post not found with id: " + id
                        )
                );

        repository.delete(post);
    }
}