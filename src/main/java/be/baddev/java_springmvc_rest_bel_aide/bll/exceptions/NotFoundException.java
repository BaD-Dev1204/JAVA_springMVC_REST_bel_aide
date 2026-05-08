package be.baddev.java_springmvc_rest_bel_aide.bll.exceptions;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}