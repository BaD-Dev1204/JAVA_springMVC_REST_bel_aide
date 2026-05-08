package be.baddev.java_springmvc_rest_bel_aide.pl.advices;

import be.baddev.java_springmvc_rest_bel_aide.pl.errors.ApiError;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.BadRequestException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.ConflictException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.ForbiddenException;
import be.baddev.java_springmvc_rest_bel_aide.pl.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class HttpControllerAdvice {

    // =========================
    // 404 - NOT FOUND
    // =========================
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

    // =========================
    // 400 - BAD REQUEST
    // =========================
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

    // =========================
    // 403 - FORBIDDEN
    // =========================
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

    // =========================
    // 409 - CONFLICT
    // =========================
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

    // =========================
    // 500 - fallback
    // =========================
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