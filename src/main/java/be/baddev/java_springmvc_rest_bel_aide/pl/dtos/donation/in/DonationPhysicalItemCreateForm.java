package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DonationPhysicalItemCreateForm extends PhysicalPostCreateForm {

    @NotNull(message = "Condition is required")
    private DonationCondition condition;

    @NotNull(message = "Delivery option is required")
    private Boolean isDeliveryPossible;
}