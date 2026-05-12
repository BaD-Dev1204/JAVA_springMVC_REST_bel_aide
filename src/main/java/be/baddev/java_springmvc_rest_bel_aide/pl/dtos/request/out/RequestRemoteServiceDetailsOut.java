package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Detailed DTO for remote service requests.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "RequestRemoteServiceDetailsOut",
        description = "Detailed remote service request"
)
public record RequestRemoteServiceDetailsOut(

        /**
         * Unique identifier of the request.
         */
        @Schema(description = "Request ID", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the request.
         */
        @Schema(description = "Title", example = "Need online tutoring")
        String title,

        /**
         * Description of the request.
         */
        @Schema(description = "Description", example = "Help needed for math tutoring")
        String description,

        /**
         * Status of the request.
         */
        @Schema(description = "Status", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the request.
         */
        @Schema(description = "Type", example = "REQUEST")
        PostType type,

        /**
         * Mode of the request.
         */
        @Schema(description = "Mode", example = "REMOTE")
        PostMode mode,

        /**
         * Urgency level of the request.
         */
        @Schema(description = "Urgency level", example = "LOW")
        RequestUrgencyLevel urgencyLevel,

        /**
         * Date before which the request is needed.
         */
        @Schema(description = "Needed before date", example = "2026-03-01T09:00:00")
        LocalDateTime neededBefore
) {}