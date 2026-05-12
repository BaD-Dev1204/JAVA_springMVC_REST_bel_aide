package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.request.in;

import be.baddev.java_springmvc_rest_bel_aide.dal.enums.post.RequestUrgencyLevel;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.RemotePostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

/**
 * DTO used to create a remote service request.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(
        name = "RequestRemoteServiceCreateForm",
        description = "Payload used to create a remote service request"
)
public class RequestRemoteServiceCreateForm extends RemotePostCreateForm {

    /**
     * Urgency level of the request.
     */
    @NotNull
    @Schema(description = "Urgency level", example = "LOW")
    private RequestUrgencyLevel urgencyLevel;

    /**
     * Date before which the request is needed.
     */
    @Schema(description = "Needed before date", example = "2026-03-01T09:00:00")
    private LocalDateTime neededBefore;
}