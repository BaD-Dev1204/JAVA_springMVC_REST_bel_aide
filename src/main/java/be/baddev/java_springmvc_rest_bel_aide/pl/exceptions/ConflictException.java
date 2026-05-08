package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

public class ConflictException extends RuntimeException {
    public ConflictException(String message) {
        super(message);
    }
}