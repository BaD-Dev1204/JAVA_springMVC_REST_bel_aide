package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.request;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Request;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestPhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestPhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in.RequestRemoteServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestPhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestPhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out.RequestRemoteServiceDetailsOut;
import org.springframework.stereotype.Component;

@Component
public class RequestMapperImpl implements RequestMapper {

    @Override
    public Request physicalItemCreateFormToEntity(RequestPhysicalItemCreateForm dto) {

        return new Request(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.getUrgencyLevel(),
                dto.getNeededBefore()
        );
    }

    @Override
    public Request physicalServiceCreateFormToEntity(RequestPhysicalServiceCreateForm dto) {

        return new Request(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.getUrgencyLevel(),
                dto.getNeededBefore()
        );
    }

    @Override
    public Request remoteServiceCreateFormToEntity(RequestRemoteServiceCreateForm dto) {

        return new Request(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                null,
                null,
                null,
                dto.getUrgencyLevel(),
                dto.getNeededBefore()
        );
    }

    @Override
    public RequestIndexOut entityToIndexOut(Request entity) {

        return new RequestIndexOut(
                entity.getId(),
                entity.getTitle(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getUrgencyLevel(),
                entity.getNeededBefore()
        );
    }

    @Override
    public RequestPhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Request entity) {

        return new RequestPhysicalItemDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getUrgencyLevel(),
                entity.getNeededBefore()
        );
    }

    @Override
    public RequestPhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Request entity) {

        return new RequestPhysicalServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.getUrgencyLevel(),
                entity.getNeededBefore()
        );
    }

    @Override
    public RequestRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Request entity) {

        return new RequestRemoteServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getUrgencyLevel(),
                entity.getNeededBefore()
        );
    }
}