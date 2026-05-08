package be.baddev.java_springmvc_rest_bel_aide.pl.errors;

import java.time.LocalDateTime;

public record ApiError(
        int status,
        String error,
        String message,
        LocalDateTime timestamp
) {}