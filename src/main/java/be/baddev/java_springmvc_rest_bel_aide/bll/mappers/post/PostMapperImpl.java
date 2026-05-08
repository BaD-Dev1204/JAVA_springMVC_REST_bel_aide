package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Post;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.out.PostDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.out.PostIndexOut;
import org.springframework.stereotype.Component;

@Component
public class PostMapperImpl implements PostMapper {

    @Override
    public Post PhysicalPostCreateFormToPostEntityMapper(PhysicalPostCreateForm dto) {

        Post post = new Post(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude()
        );

        return post;
    }

    @Override
    public Post RemotePostCreateFormToPostEntityMapper(RemotePostCreateForm dto) {

        Post post = new Post(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                null,
                null,
                null
        );

        return post;
    }

    @Override
    public PostIndexOut PostEntityToPostIndexOutMapper(Post entity) {

        return new PostIndexOut(
                entity.getId(),
                entity.getTitle(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode()
        );
    }

    @Override
    public PostDetailsOut PostEntityToPostDetailsOutMapper(Post entity) {

        return new PostDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude()
        );
    }
}