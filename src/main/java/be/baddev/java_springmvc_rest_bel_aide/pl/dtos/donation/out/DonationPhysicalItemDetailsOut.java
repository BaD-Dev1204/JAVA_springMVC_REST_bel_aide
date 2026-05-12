package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Detailed DTO representing a physical item donation.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "DonationPhysicalItemDetailsOut",
        description = "Detailed information of a physical item donation"
)
public record DonationPhysicalItemDetailsOut(

        /**
         * Unique identifier of the donation.
         */
        @Schema(description = "Unique identifier", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the donation.
         */
        @Schema(description = "Title of the donation", example = "Old bike")
        String title,

        /**
         * Detailed description of the donation.
         */
        @Schema(description = "Full description of the donation", example = "Used mountain bike in good condition")
        String description,

        /**
         * Current status of the donation.
         */
        @Schema(description = "Status of the post", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the post.
         */
        @Schema(description = "Type of post", example = "ITEM")
        PostType type,

        /**
         * Mode of the post (physical or remote).
         */
        @Schema(description = "Mode of post", example = "PHYSICAL")
        PostMode mode,

        /**
         * City where the donation is available.
         */
        @Schema(description = "City of the donation", example = "Brussels")
        String city,

        /**
         * Latitude coordinate of the donation location.
         */
        @Schema(description = "Latitude", example = "50.8503")
        BigDecimal latitude,

        /**
         * Longitude coordinate of the donation location.
         */
        @Schema(description = "Longitude", example = "4.3517")
        BigDecimal longitude,

        /**
         * Condition of the donated item.
         */
        @Schema(description = "Condition of the item", example = "GOOD")
        DonationCondition condition,

        /**
         * Indicates if delivery is possible.
         */
        @Schema(description = "Delivery availability", example = "true")
        Boolean isDeliveryPossible
) {}