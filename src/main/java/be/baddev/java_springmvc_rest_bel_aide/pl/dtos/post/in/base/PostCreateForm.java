package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostMode;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostType;
import jakarta.validation.constraints.*;
import lombok.*;
import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.PostStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class PostCreateForm {

    @NotBlank(message = "Title is required")
    @Size(min = 2, max = 500)
    private String title;

    @NotBlank(message = "Description is required")
    @Size(min = 2, max = 1000)
    private String description;

    @NotNull(message = "Status is required")
    @Size(min = 2, max = 50)
    private PostStatus status;

    @NotNull(message = "Type is required")
    @Size(min = 2, max = 20)
    private PostType type;

    @NotNull(message = "Mode is required")
    @Size(min = 2, max = 20)
    private PostMode mode;

}