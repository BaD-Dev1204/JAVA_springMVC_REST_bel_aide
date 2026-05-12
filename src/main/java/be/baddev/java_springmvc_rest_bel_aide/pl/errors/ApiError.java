package be.baddev.java_springmvc_rest_bel_aide.pl.errors;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

/**
 * Standard API error response returned by the REST API.
 *
 * <p>
 * This record is used by the http exception handler
 * to provide consistent error responses to API clients.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Schema(
        name = "ApiError",
        description = "Standard REST API error response"
)
public record ApiError(

        /**
         * HTTP status code associated with the error.
         */
        @Schema(
                description = "HTTP status code",
                example = "404"
        )
        int status,

        /**
         * Short error identifier.
         */
        @Schema(
                description = "Error identifier",
                example = "NOT_FOUND"
        )
        String error,

        /**
         * Detailed error message.
         */
        @Schema(
                description = "Detailed error message",
                example = "Donation not found"
        )
        String message,

        /**
         * Date and time when the error occurred.
         */
        @Schema(
                description = "Timestamp of the error",
                example = "2026-05-08T19:45:00"
        )
        LocalDateTime timestamp
) {}