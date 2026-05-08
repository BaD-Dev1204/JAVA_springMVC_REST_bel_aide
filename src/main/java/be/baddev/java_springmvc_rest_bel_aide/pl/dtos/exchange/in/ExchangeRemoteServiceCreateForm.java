package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ExchangeRemoteServiceCreateForm
        extends RemotePostCreateForm {

    @NotBlank(message = "Is flexible is required")
    private boolean isFlexible;
}