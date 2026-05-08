package be.baddev.java_springmvc_rest_bel_aide.bll.exceptions;

public class OperationNotAllowedException extends RuntimeException {

    public OperationNotAllowedException(String message) {
        super(message);
    }
}