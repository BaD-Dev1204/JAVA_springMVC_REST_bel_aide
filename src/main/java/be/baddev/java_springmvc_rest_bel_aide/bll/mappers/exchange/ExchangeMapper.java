package be.baddev.java_springmvc_rest_bel_aide.bll.mappers.exchange;

import be.baddev.java_springmvc_rest_bel_aide.dal.entities.post.Exchange;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangePhysicalItemCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangePhysicalServiceCreateForm;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in.ExchangeRemoteServiceCreateForm;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangeIndexOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangePhysicalItemDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangePhysicalServiceDetailsOut;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out.ExchangeRemoteServiceDetailsOut;

public interface ExchangeMapper {

    Exchange physicalItemCreateFormToEntity(ExchangePhysicalItemCreateForm dto);

    Exchange physicalServiceCreateFormToEntity(ExchangePhysicalServiceCreateForm dto);

    Exchange remoteServiceCreateFormToEntity(ExchangeRemoteServiceCreateForm dto);

    ExchangeIndexOut entityToIndexOut(Exchange entity);

    ExchangePhysicalItemDetailsOut entityToPhysicalItemDetailsOut(Exchange entity);

    ExchangePhysicalServiceDetailsOut entityToPhysicalServiceDetailsOut(Exchange entity);

    ExchangeRemoteServiceDetailsOut entityToRemoteServiceDetailsOut(Exchange entity);
}