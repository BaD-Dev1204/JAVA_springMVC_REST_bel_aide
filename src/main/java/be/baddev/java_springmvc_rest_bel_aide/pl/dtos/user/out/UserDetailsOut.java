package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Detailed DTO representing a user.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "UserDetailsOut",
        description = "Detailed representation of a user"
)
public record UserDetailsOut(

        /**
         * Internal user ID.
         */
        @Schema(
                description = "User ID",
                example = "550e8400-e29b-41d4-a716-446655440000"
        )
        UUID id,

        /**
         * Keycloak user ID.
         */
        @Schema(
                description = "Keycloak ID",
                example = "11111111-e29b-41d4-a716-446655440000"
        )
        String keycloakId,

        /**
         * User city.
         */
        @Schema(description = "City", example = "Brussels")
        String city,

        /**
         * Latitude.
         */
        @Schema(description = "Latitude", example = "50.8503")
        BigDecimal latitude,

        /**
         * Longitude.
         */
        @Schema(description = "Longitude", example = "4.3517")
        BigDecimal longitude,

        /**
         * Creation date.
         */
        @Schema(description = "Creation date")
        LocalDateTime createdAt,

        /**
         * Last update date.
         */
        @Schema(description = "Last update date")
        LocalDateTime updatedAt

) {}