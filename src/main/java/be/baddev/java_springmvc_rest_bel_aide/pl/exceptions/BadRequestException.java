package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

/**
 * Exception thrown when the client sends
 * an invalid or malformed request.
 *
 * <p>
 * Usually associated with HTTP 400 Bad Request.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
public class BadRequestException extends RuntimeException {

    /**
     * Creates a new bad request exception.
     *
     * @param message detailed error message
     */
    public BadRequestException(String message) {
        super(message);
    }
}