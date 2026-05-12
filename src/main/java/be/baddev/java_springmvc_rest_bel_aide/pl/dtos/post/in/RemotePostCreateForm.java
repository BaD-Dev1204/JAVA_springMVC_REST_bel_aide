package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base.PostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * DTO used for remote posts creation.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "RemotePostCreateForm",
        description = "Base form for remote posts"
)
public abstract class RemotePostCreateForm extends PostCreateForm {
}