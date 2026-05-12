package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Detailed DTO for physical item requests.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "RequestPhysicalItemDetailsOut",
        description = "Detailed physical item request"
)
public record RequestPhysicalItemDetailsOut(

        /**
         * Unique identifier of the request.
         */
        @Schema(description = "Request ID", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the request.
         */
        @Schema(description = "Title", example = "Need furniture help")
        String title,

        /**
         * Description of the request.
         */
        @Schema(description = "Description", example = "Help needed to move furniture")
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
        @Schema(description = "Mode", example = "PHYSICAL")
        PostMode mode,

        /**
         * City where the request is located.
         */
        @Schema(description = "City", example = "Brussels")
        String city,

        /**
         * Latitude of the request location.
         */
        @Schema(description = "Latitude", example = "50.8503")
        BigDecimal latitude,

        /**
         * Longitude of the request location.
         */
        @Schema(description = "Longitude", example = "4.3517")
        BigDecimal longitude,

        /**
         * Urgency level of the request.
         */
        @Schema(description = "Urgency level", example = "HIGH")
        RequestUrgencyLevel urgencyLevel,

        /**
         * Date before which the request is needed.
         */
        @Schema(description = "Needed before date", example = "2026-12-31T12:00:00")
        LocalDateTime neededBefore
) {}