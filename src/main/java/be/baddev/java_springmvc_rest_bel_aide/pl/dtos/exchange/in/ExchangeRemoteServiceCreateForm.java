package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a remote service exchange.
 *
 * <p>This represents an exchange of services that can be performed remotely
 * (e.g. online help, digital collaboration).</p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "ExchangeRemoteServiceCreateForm",
        description = "Payload used to create a remote service exchange"
)
public class ExchangeRemoteServiceCreateForm extends RemotePostCreateForm {

    /**
     * Indicates whether the exchange is flexible.
     */
    @NotNull(message = "Is flexible is required")
    @Schema(description = "Indicates if the exchange is flexible", example = "true")
    private boolean isFlexible;
}