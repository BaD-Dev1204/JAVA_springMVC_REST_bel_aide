package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a physical donation item.
 *
 * <p>This form is used by the API layer (PL) to receive data from clients
 * when they want to create a donation representing a physical object
 * (e.g. furniture, clothes, electronics).</p>
 *
 * <p>It extends {@link PhysicalPostCreateForm}, meaning it inherits
 * common post fields such as title, description, city and coordinates.</p>
 *
 * <p>This DTO is validated before reaching the service layer.</p>
 *
 * <ul>
 *     <li>{@code condition} defines the state of the donated item</li>
 *     <li>{@code isDeliveryPossible} indicates if the donor can deliver the item</li>
 * </ul>
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
        name = "DonationPhysicalItemCreateForm",
        description = "Payload used to create a physical donation item"
)
public class DonationPhysicalItemCreateForm extends PhysicalPostCreateForm {

    /**
     * Condition of the donated item.
     *
     * @since 1.0
     */
    @NotNull(message = "Condition is required")
    @Schema(
            description = "Condition of the donated item",
            example = "GOOD",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private DonationCondition condition;

    /**
     * Indicates whether delivery of the item is possible.
     *
     * @since 1.0
     */
    @NotNull(message = "Delivery option is required")
    @Schema(
            description = "Whether delivery is possible for this donation",
            example = "true",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private Boolean isDeliveryPossible;
}