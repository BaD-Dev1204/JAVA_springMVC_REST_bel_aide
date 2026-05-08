package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in;
import be.baddev.java_springmvc_rest_bel_aide.pl.dtos.post.in.base.PostCreateForm;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public abstract class PhysicalPostCreateForm extends PostCreateForm {

    @NotBlank(message = "City is required")
    @Size(min = 2, max = 150)
    private String city;

    @NotNull(message = "Latitude is required")
    @Digits(integer = 2, fraction = 8)
    @DecimalMin(value = "-90.00000000")
    @DecimalMax(value = "90.00000000")
    private BigDecimal latitude;

    @NotNull(message = "Longitude is required")
    @Digits(integer = 3, fraction = 8)
    @DecimalMin(value = "-180.00000000")
    @DecimalMax(value = "180.00000000")
    private BigDecimal longitude;
}