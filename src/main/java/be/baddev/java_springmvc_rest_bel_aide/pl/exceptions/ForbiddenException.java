package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

/**
 * Exception thrown when the client
 * does not have permission to access a resource.
 *
 * <p>
 * Usually associated with HTTP 403 Forbidden.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
public class ForbiddenException extends RuntimeException {

    /**
     * Creates a new forbidden exception.
     *
     * @param message detailed error message
     */
    public ForbiddenException(String message) {
        super(message);
    }
}