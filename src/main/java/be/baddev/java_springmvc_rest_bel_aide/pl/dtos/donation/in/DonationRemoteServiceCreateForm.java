package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * DTO used to create a remote service donation.
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
        name = "DonationRemoteServiceCreateForm",
        description = "Payload used to create a remote service donation"
)
public class DonationRemoteServiceCreateForm extends RemotePostCreateForm {

    /**
     * Condition or quality level of the remote service being offered.
     */
    @NotNull(message = "Condition is required")
    @Schema(
            description = "Condition or quality level of the remote service",
            example = "GOOD",
            requiredMode = Schema.RequiredMode.REQUIRED
    )
    private DonationCondition condition;
}