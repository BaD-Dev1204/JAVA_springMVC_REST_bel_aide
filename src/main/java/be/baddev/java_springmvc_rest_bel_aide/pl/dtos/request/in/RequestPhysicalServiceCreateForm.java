package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RequestPhysicalServiceCreateForm
        extends PhysicalPostCreateForm {

    @NotNull
    private RequestUrgencyLevel urgencyLevel;

    private LocalDateTime neededBefore;
}