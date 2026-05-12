package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * DTO used for listing requests.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "RequestIndexOut",
        description = "Summary representation of a request"
)
public record RequestIndexOut(

        /**
         * Unique identifier.
         */
        @Schema(description = "Request ID", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the request.
         */
        @Schema(description = "Title", example = "Need help moving")
        String title,

        /**
         * Status of the request.
         */
        @Schema(description = "Status", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of request.
         */
        @Schema(description = "Type", example = "REQUEST")
        PostType type,

        /**
         * Mode of request.
         */
        @Schema(description = "Mode", example = "PHYSICAL")
        PostMode mode,

        /**
         * Urgency level.
         */
        @Schema(description = "Urgency level", example = "HIGH")
        RequestUrgencyLevel urgencyLevel,

        /**
         * Needed before date.
         */
        @Schema(description = "Deadline", example = "2026-12-31T12:00:00")
        LocalDateTime neededBefore
) {}