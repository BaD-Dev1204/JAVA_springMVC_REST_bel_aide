package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.in;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

/**
 * DTO used for updating a user.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Schema(
        name = "UserUpdateForm",
        description = "Form used to update a user"
)
public class UserUpdateForm {

    /**
     * User city.
     */
    @Size(min = 2, max = 150)
    @Schema(description = "City", example = "Brussels")
    private String city;

    /**
     * Latitude.
     */
    @Digits(integer = 2, fraction = 16)
    @DecimalMin(value = "-90.00000000")
    @DecimalMax(value = "90.00000000")
    @Schema(description = "Latitude", example = "50.00000000")
    private BigDecimal latitude;

    /**
     * Longitude.
     */
    @Digits(integer = 3, fraction = 16)
    @DecimalMin(value = "-180.00000000")
    @DecimalMax(value = "180.00000000")
    @Schema(description = "Longitude", example = "4.00000000")
    private BigDecimal longitude;

}