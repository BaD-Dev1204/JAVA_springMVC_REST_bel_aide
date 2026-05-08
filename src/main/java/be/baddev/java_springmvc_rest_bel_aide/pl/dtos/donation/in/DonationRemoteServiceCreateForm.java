package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.donation.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.DonationCondition;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DonationRemoteServiceCreateForm extends RemotePostCreateForm {

    @NotNull(message = "Condition is required")
    private DonationCondition condition;
}
