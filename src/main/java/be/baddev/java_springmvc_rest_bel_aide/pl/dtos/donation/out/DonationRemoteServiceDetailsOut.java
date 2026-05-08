package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;

import java.util.UUID;

public record DonationRemoteServiceDetailsOut(

        UUID id,
        String title,
        String description,
        PostStatus status,
        PostType type,
        PostMode mode,

        Boolean isDeliveryPossible



) {}