package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * Detailed DTO representing a remote service donation.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "DonationRemoteServiceDetailsOut",
        description = "Detailed information of a remote service donation"
)
public record DonationRemoteServiceDetailsOut(

        /**
         * Unique identifier of the donation.
         */
        @Schema(description = "Unique identifier", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the donation.
         */
        @Schema(description = "Title of the donation", example = "Online tutoring")
        String title,

        /**
         * Detailed description of the donation.
         */
        @Schema(description = "Full description", example = "Math tutoring sessions online")
        String description,

        /**
         * Current status of the donation.
         */
        @Schema(description = "Status of the post", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the post.
         */
        @Schema(description = "Type of post", example = "SERVICE")
        PostType type,

        /**
         * Mode of the post.
         */
        @Schema(description = "Mode of post", example = "REMOTE")
        PostMode mode,

        /**
         * Indicates if delivery is possible.
         */
        @Schema(description = "Delivery availability", example = "false")
        Boolean isDeliveryPossible
) {}