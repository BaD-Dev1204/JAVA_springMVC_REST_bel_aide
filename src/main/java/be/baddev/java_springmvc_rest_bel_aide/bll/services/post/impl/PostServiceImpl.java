package be.baddev.java_springmvc_rest_bel_aide.bll.services.post.impl;

import be.baddev.java_springmvc_rest_bel_aide.bll.services.post.interfaces.PostService;
import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Post;
import be.baddev.java_springmvc_rest_bel_aide.dal.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
        return repository.save(entity);
    }

    @Override
    public Optional<Post> findById(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }
}