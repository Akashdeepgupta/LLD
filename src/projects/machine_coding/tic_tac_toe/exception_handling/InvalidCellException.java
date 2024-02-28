package projects.machine_coding.tic_tac_toe.exception_handling;

public class InvalidCellException extends RuntimeException{
    public InvalidCellException() {
        super();
    }

    public InvalidCellException(String message) {
        super(message);
    }

    public InvalidCellException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCellException(Throwable cause) {
        super(cause);
    }

    protected InvalidCellException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
