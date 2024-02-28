package projects.machine_coding.tic_tac_toe.exception_handling;

public class InvalidRowColException extends RuntimeException{
    public InvalidRowColException() {
        super();
    }

    public InvalidRowColException(String message) {
        super(message);
    }

    public InvalidRowColException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRowColException(Throwable cause) {
        super(cause);
    }

    protected InvalidRowColException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
