package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.exchange;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangePhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangePhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangeRemoteServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangeIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangePhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangePhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangeRemoteServiceDetailsOut;
import org.springframework.stereotype.Component;

@Component
public class ExchangeMapperImpl implements ExchangeMapper {

    @Override
    public Exchange physicalItemCreateFormToEntity(ExchangePhysicalItemCreateForm dto) {

        return new Exchange(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.isFlexible()
        );
    }

    @Override
    public Exchange physicalServiceCreateFormToEntity(ExchangePhysicalServiceCreateForm dto) {

        return new Exchange(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                dto.getCity(),
                dto.getLatitude(),
                dto.getLongitude(),
                dto.isFlexible()
        );
    }

    @Override
    public Exchange remoteServiceCreateFormToEntity(ExchangeRemoteServiceCreateForm dto) {

        return new Exchange(
                dto.getTitle(),
                dto.getDescription(),
                dto.getStatus(),
                dto.getType(),
                dto.getMode(),
                null,
                null,
                null,
                dto.isFlexible()
        );
    }

    @Override
    public ExchangeIndexOut entityToIndexOut(Exchange entity) {

        return new ExchangeIndexOut(
                entity.getId(),
                entity.getTitle(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode()
        );
    }

    @Override
    public ExchangePhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Exchange entity) {

        return new ExchangePhysicalItemDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.isFlexible()
        );
    }

    @Override
    public ExchangePhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Exchange entity) {

        return new ExchangePhysicalServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.getCity(),
                entity.getLatitude(),
                entity.getLongitude(),
                entity.isFlexible()
        );
    }

    @Override
    public ExchangeRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Exchange entity) {

        return new ExchangeRemoteServiceDetailsOut(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getStatus(),
                entity.getPostType(),
                entity.getPostMode(),
                entity.isFlexible()
        );
    }
}