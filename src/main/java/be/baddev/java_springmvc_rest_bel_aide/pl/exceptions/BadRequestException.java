package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}