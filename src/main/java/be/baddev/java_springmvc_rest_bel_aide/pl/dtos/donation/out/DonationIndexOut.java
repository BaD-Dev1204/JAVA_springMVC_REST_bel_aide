package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;

import java.util.UUID;

public record DonationIndexOut(
        UUID id,
        String title,
        PostStatus status,
        PostMode mode,
        String city
) {}