package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;

/**
 * Base DTO used to create any Post (Donation, Exchange, etc.).
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "PostCreateForm",
        description = "Base payload for creating a post"
)
public abstract class PostCreateForm {

    /**
     * Title of the post.
     */
    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 500)
    @Schema(description = "Title of the post", example = "Old bike for exchange")
    private String title;

    /**
     * Description of the post.
     */
    @NotBlank(message = "Description is required")
    @Size(min = 2, max = 1000)
    @Schema(description = "Description of the post", example = "Well maintained bike")
    private String description;

    /**
     * Status of the post.
     */
    @NotNull(message = "Status is required")
    @Schema(description = "Status of the post", example = "ACTIVE")
    private PostStatus status;

    /**
     * Type of the post.
     */
    @NotNull(message = "Type is required")
    @Schema(description = "Type of the post", example = "EXCHANGE")
    private PostType type;

    /**
     * Mode of the post.
     */
    @NotNull(message = "Mode is required")
    @Schema(description = "Mode of the post", example = "PHYSICAL")
    private PostMode mode;
}