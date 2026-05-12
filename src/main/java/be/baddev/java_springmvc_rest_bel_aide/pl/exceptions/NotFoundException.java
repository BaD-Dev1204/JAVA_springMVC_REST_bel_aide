package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

/**
 * Exception thrown when a requested resource
 * cannot be found.
 *
 * <p>
 * Usually associated with HTTP 404 Not Found.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
public class NotFoundException extends RuntimeException {

    /**
     * Creates a new not found exception.
     *
     * @param message detailed error message
     */
    public NotFoundException(String message) {
        super(message);
    }
}