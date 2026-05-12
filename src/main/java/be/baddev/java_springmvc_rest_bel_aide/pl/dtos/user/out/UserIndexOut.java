package be.baddev.java_springmvc_rest_bel_aide.pl.dtos.user.out;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.UUID;

/**
 * DTO used for listing users.
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "UserIndexOut",
        description = "Summary representation of a user"
)
public record UserIndexOut(

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
        String city

) {}