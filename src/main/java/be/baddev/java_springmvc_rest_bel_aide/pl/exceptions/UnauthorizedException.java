package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}