package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Detailed DTO representing a physical item exchange.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "ExchangePhysicalItemDetailsOut",
        description = "Detailed information of a physical item exchange"
)
public record ExchangePhysicalItemDetailsOut(

        /**
         * Unique identifier of the exchange.
         */
        @Schema(description = "Unique identifier", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the exchange.
         */
        @Schema(description = "Title of the exchange", example = "Laptop for bike")
        String title,

        /**
         * Full description of the exchange.
         */
        @Schema(description = "Description of the exchange", example = "Exchange laptop for bike")
        String description,

        /**
         * Current status of the exchange.
         */
        @Schema(description = "Status of the exchange", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the post.
         */
        @Schema(description = "Type of post", example = "EXCHANGE")
        PostType type,

        /**
         * Mode of the exchange (physical or remote).
         */
        @Schema(description = "Mode of the post", example = "PHYSICAL")
        PostMode mode,

        /**
         * City where the exchange is located.
         */
        @Schema(description = "City of the exchange", example = "Brussels")
        String city,

        /**
         * Latitude coordinate of the exchange location.
         */
        @Schema(description = "Latitude", example = "50.8503")
        BigDecimal latitude,

        /**
         * Longitude coordinate of the exchange location.
         */
        @Schema(description = "Longitude", example = "4.3517")
        BigDecimal longitude,

        /**
         * Indicates whether the exchange is flexible.
         */
        @Schema(description = "Is exchange flexible", example = "true")
        boolean isFlexible
) {}