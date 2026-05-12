package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * DTO used to display a donation in list (index view).
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "DonationIndexOut",
        description = "Summary view of a donation used in listing endpoints"
)
public record DonationIndexOut(

        /**
         * Unique identifier of the donation.
         */
        @Schema(description = "Unique identifier", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the donation.
         */
        @Schema(description = "Title of the donation", example = "Old sofa")
        String title,

        /**
         * Current status of the donation.
         */
        @Schema(description = "Status of the post", example = "ACTIVE")
        PostStatus status,

        /**
         * Mode of the donation (physical or remote).
         */
        @Schema(description = "Mode of the post", example = "PHYSICAL")
        PostMode mode,

        /**
         * City where the donation is available.
         */
        @Schema(description = "City of the donation", example = "Brussels")
        String city
) {}