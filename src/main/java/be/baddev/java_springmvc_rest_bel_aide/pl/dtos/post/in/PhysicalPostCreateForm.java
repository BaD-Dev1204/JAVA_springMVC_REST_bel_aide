package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in;

import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base.PostCreateForm;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * DTO used for physical posts creation.
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
        name = "PhysicalPostCreateForm",
        description = "Base form for physical posts"
)
public abstract class PhysicalPostCreateForm extends PostCreateForm {

    /**
     * City where the post is located.
     */
    @NotBlank(message = "City is required")
    @Size(min = 2, max = 150)
    @Schema(description = "City", example = "Brussels")
    private String city;

    /**
     * Latitude of the location.
     */
    @NotNull(message = "Latitude is required")
    @Digits(integer = 2, fraction = 16)
    @DecimalMin(value = "-90.00000000")
    @DecimalMax(value = "90.00000000")
    @Schema(description = "Latitude", example = "50.8503")
    private BigDecimal latitude;

    /**
     * Longitude of the location.
     */
    @NotNull(message = "Longitude is required")
    @Digits(integer = 3, fraction = 16)
    @DecimalMin(value = "-180.00000000")
    @DecimalMax(value = "180.00000000")
    @Schema(description = "Longitude", example = "4.3517")
    private BigDecimal longitude;
}