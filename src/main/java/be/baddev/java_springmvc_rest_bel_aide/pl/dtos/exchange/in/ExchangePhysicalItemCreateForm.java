package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.exchange.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a physical item exchange.
 *
 * <p>This form allows a user to propose an exchange of a physical item
 * (e.g. trading objects between users).</p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "ExchangePhysicalItemCreateForm",
        description = "Payload used to create a physical item exchange"
)
public class ExchangePhysicalItemCreateForm extends PhysicalPostCreateForm {

    /**
     * Indicates whether the exchange is flexible (time, conditions, etc.).
     */
    @NotNull(message = "Is flexible is required")
    @Schema(description = "Indicates if the exchange is flexible", example = "true")
    private boolean isFlexible;
}