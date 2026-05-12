package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a physical service donation.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "DonationPhysicalServiceCreateForm",
        description = "Payload used to create a physical service donation"
)
public class DonationPhysicalServiceCreateForm extends PhysicalPostCreateForm {

    /**
     * Indicates whether the service can be performed or delivered on-site.
     */
    @NotNull(message = "Delivery option is required")
    @Schema(
            description = "Indicates if the service can be performed on-site",
            example = "true",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Boolean isDeliveryPossible;
}