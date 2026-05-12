package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.PhysicalPostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

/**
 * DTO used to create a physical item request.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "RequestPhysicalItemCreateForm",
        description = "Payload used to create a physical item request"
)
public class RequestPhysicalItemCreateForm extends PhysicalPostCreateForm {

    /**
     * Urgency level of the request.
     */
    @NotNull
    @Schema(description = "Urgency level", example = "HIGH")
    private RequestUrgencyLevel urgencyLevel;

    /**
     * Date before which the request is needed.
     */
    @Schema(description = "Needed before date", example = "2026-12-31T12:00:00")
    private LocalDateTime neededBefore;
}