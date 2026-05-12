package be.baddev.java_springmvc_rest_bel_aide.pl.advices;

import be.baddev.java_springmvc_rest_bel_aide.pl.errors.ApiError;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.BadRequestException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.ConflictException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.ForbiddenException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.NotFoundException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.UnauthorizedException;
import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

/**
 * Global REST exception handler.
 *
 * <p>
 * This advice centralizes HTTP exception handling
 * for all REST controllers of the application.
 * </p>
 *
 * <p>
 * Each handled exception is converted into
 * a standardized {@link ApiError} response.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
@Hidden
@RestControllerAdvice
public class HttpControllerAdvice {

    /**
     * Handles resource not found exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(NotFoundException ex) {

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(
                        HttpStatus.NOT_FOUND.value(),
                        "NOT_FOUND",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }

    /**
     * Handles invalid request exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ApiError> handleBadRequest(BadRequestException ex) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ApiError(
                        HttpStatus.BAD_REQUEST.value(),
                        "BAD_REQUEST",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }

    /**
     * Handles forbidden access exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(ForbiddenException.class)
    public ResponseEntity<ApiError> handleForbidden(ForbiddenException ex) {

        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(new ApiError(
                        HttpStatus.FORBIDDEN.value(),
                        "FORBIDDEN",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }

    /**
     * Handles unauthorized access exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<ApiError> handleUnauthorized(UnauthorizedException ex) {

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ApiError(
                        HttpStatus.UNAUTHORIZED.value(),
                        "UNAUTHORIZED",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }

    /**
     * Handles resource conflict exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(ConflictException.class)
    public ResponseEntity<ApiError> handleConflict(ConflictException ex) {

        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(new ApiError(
                        HttpStatus.CONFLICT.value(),
                        "CONFLICT",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }

    /**
     * Handles all unhandled exceptions.
     *
     * @param ex thrown exception
     * @return standardized API error response
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleGeneric(Exception ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ApiError(
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        "INTERNAL_ERROR",
                        ex.getMessage(),
                        LocalDateTime.now()
                ));
    }
}