package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a physical service exchange.
 *
 * <p>This represents an exchange involving a physical service
 * (e.g. skill exchange or help-based service).</p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "ExchangePhysicalServiceCreateForm",
        description = "Payload used to create a physical service exchange"
)
public class ExchangePhysicalServiceCreateForm extends PhysicalPostCreateForm {

    /**
     * Indicates whether the exchange conditions are flexible.
     */
    @NotNull(message = "Is flexible is required")
    @Schema(description = "Indicates if the exchange is flexible", example = "false")
    private boolean isFlexible;
}