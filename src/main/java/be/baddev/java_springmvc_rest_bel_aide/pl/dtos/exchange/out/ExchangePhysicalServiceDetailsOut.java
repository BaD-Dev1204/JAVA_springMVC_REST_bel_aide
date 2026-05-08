package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;

import java.math.BigDecimal;
import java.util.UUID;

public record ExchangePhysicalServiceDetailsOut(

        UUID id,
        String title,
        String description,
        PostStatus status,
        PostType type,
        PostMode mode,

        String city,
        BigDecimal latitude,
        BigDecimal longitude,

        boolean isFlexible

) {}