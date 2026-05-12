package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * DTO used to display an exchange in list view.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "ExchangeIndexOut",
        description = "Summary view of an exchange"
)
public record ExchangeIndexOut(

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
         * Current status of the exchange.
         */
        @Schema(description = "Status of the exchange", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the exchange post.
         */
        @Schema(description = "Type of post", example = "EXCHANGE")
        PostType type,

        /**
         * Mode of the exchange (physical or remote).
         */
        @Schema(description = "Mode of the post", example = "PHYSICAL")
        PostMode mode
) {}