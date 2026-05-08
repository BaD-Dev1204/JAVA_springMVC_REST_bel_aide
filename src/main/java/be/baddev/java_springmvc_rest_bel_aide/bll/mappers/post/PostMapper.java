package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.post;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Post;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.out.PostIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.out.PostDetailsOut;

public interface PostMapper {

    Post PhysicalPostCreateFormToPostEntityMapper(PhysicalPostCreateForm dto);

    Post RemotePostCreateFormToPostEntityMapper(RemotePostCreateForm dto);

    PostIndexOut PostEntityToPostIndexOutMapper(Post entity);

    PostDetailsOut PostEntityToPostDetailsOutMapper(Post entity);
}