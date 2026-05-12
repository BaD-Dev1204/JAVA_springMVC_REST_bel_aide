package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Detailed DTO representing a physical service exchange.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "ExchangePhysicalServiceDetailsOut",
        description = "Detailed information of a physical service exchange"
)
public record ExchangePhysicalServiceDetailsOut(

        /**
         * Unique identifier of the exchange.
         */
        @Schema(description = "Unique identifier", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the exchange.
         */
        @Schema(description = "Title of the exchange", example = "Gardening vs repair")
        String title,

        /**
         * Full description of the exchange.
         */
        @Schema(description = "Description of the exchange", example = "Exchange gardening help for repair service")
        String description,

        /**
         * Current status of the exchange.
         */
        @Schema(description = "Status of the exchange", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of post.
         */
        @Schema(description = "Type of post", example = "EXCHANGE")
        PostType type,

        /**
         * Mode of the exchange.
         */
        @Schema(description = "Mode of the post", example = "PHYSICAL")
        PostMode mode,

        /**
         * City of the exchange.
         */
        @Schema(description = "City of the exchange", example = "Brussels")
        String city,

        /**
         * Latitude coordinate.
         */
        @Schema(description = "Latitude", example = "50.8503")
        BigDecimal latitude,

        /**
         * Longitude coordinate.
         */
        @Schema(description = "Longitude", example = "4.3517")
        BigDecimal longitude,

        /**
         * Indicates if the exchange is flexible.
         */
        @Schema(description = "Is flexible", example = "false")
        boolean isFlexible
) {}