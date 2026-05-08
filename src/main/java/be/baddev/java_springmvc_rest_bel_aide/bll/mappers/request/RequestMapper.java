package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.request;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Request;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestPhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestPhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestRemoteServiceCreateForm;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestPhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestPhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestRemoteServiceDetailsOut;

public interface RequestMapper {

    Request physicalItemCreateFormToEntity(RequestPhysicalItemCreateForm dto);

    Request physicalServiceCreateFormToEntity(RequestPhysicalServiceCreateForm dto);

    Request remoteServiceCreateFormToEntity(RequestRemoteServiceCreateForm dto);

    RequestIndexOut entityToIndexOut(Request entity);

    RequestPhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Request entity);

    RequestPhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Request entity);

    RequestRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Request entity);
}