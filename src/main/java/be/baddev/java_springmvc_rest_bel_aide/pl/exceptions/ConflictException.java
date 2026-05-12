package be.baddev.java_springmvc_rest_bel_aide.pl.exceptions;

/**
 * Exception thrown when a conflict occurs
 * with the current state of the resource.
 *
 * <p>
 * Usually associated with HTTP 409 Conflict.
 * </p>
 *
 * @author BaD-DeV
 * @since 1.0
 */
public class ConflictException extends RuntimeException {

    /**
     * Creates a new conflict exception.
     *
     * @param message detailed error message
     */
    public ConflictException(String message) {
        super(message);
    }
}