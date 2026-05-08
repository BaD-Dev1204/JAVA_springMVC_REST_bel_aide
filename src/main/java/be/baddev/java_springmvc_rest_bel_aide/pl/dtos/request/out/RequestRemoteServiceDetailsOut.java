package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.*;
import java.time.LocalDateTime;
import java.util.UUID;

public record RequestRemoteServiceDetailsOut(

        UUID id,
        String title,
        String description,
        PostStatus status,
        PostType type,
        PostMode mode,

        RequestUrgencyLevel urgencyLevel,
        LocalDateTime neededBefore

) {}