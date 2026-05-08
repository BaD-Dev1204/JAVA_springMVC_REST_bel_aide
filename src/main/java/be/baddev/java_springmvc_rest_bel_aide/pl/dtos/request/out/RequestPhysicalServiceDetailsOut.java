package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record RequestPhysicalServiceDetailsOut(

        UUID id,
        String title,
        String description,
        PostStatus status,
        PostType type,
        PostMode mode,

        String city,
        BigDecimal latitude,
        BigDecimal longitude,

        RequestUrgencyLevel urgencyLevel,
        LocalDateTime neededBefore

) {}