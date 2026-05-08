package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;

import java.time.LocalDateTime;
import java.util.UUID;

public record RequestIndexOut(

        UUID id,
        String title,
        PostStatus status,
        PostType type,
        PostMode mode,

        RequestUrgencyLevel urgencyLevel,
        LocalDateTime neededBefore

) {}