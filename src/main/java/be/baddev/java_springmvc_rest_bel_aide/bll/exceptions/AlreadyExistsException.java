package be.baddev.java_springmvc_rest_bel_aide.bll.exceptions;

public class AlreadyExistsException extends RuntimeException {

    public AlreadyExistsException(String message) {
        super(message);
    }
}