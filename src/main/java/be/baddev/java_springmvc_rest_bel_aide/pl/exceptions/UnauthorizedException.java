package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

/**
 * Exception thrown when authentication
 * is required or invalid.
 *
 * <p>
 * Usually associated with HTTP 401 Unauthorized.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
public class UnauthorizedException extends RuntimeException {

    /**
     * Creates a new unauthorized exception.
     *
     * @param message detailed error message
     */
    public UnauthorizedException(String message) {
        super(message);
    }
}