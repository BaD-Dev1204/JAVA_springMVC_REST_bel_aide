package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}