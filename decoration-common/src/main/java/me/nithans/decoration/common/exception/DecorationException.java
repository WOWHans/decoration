package me.nithans.decoration.common.exception;

public class DecorationException extends Exception {

    public DecorationException(String message) {
        super(message);
    }

    public DecorationException(String message, Throwable cause) {
        super(message, cause);
    }

    public DecorationException(Throwable cause) {
        super(cause);
    }
}
