package be.baddev.java_springmvc_rest_bel_aide.bll.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}