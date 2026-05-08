package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base.PostCreateForm;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class RemotePostCreateForm extends PostCreateForm {
}
