package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.out;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * DTO used for listing posts.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "PostIndexOut",
        description = "Summary representation of a post"
)
public record PostIndexOut(

        /**
         * Unique identifier.
         */
        @Schema(description = "Post ID", example = "550e8400-e29b-41d4-a716-446655440000")
        UUID id,

        /**
         * Title of the post.
         */
        @Schema(description = "Title", example = "Old bike")
        String title,

        /**
         * Status of the post.
         */
        @Schema(description = "Status", example = "ACTIVE")
        PostStatus status,

        /**
         * Type of the post.
         */
        @Schema(description = "Type", example = "EXCHANGE")
        PostType type,

        /**
         * Mode of the post.
         */
        @Schema(description = "Mode", example = "PHYSICAL")
        PostMode mode
) {}