package be.baddev.java_springmvc_rest_bel_aide.bll.exceptions;

public class InvalidStateException extends RuntimeException {

    public InvalidStateException(String message) {
        super(message);
    }
}