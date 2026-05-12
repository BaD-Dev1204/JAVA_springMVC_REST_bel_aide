package be.baddev.java_springmvc_rest_bel_aide.bll.services.post.interfaces;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Post;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PostService {

    Post create(Post entity);

    Post update(Post entity);

    Post findById(UUID id);

    List<Post> findAll();

    void delete(UUID id);
}