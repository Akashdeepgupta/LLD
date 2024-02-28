package projects.machine_coding.tic_tac_toe.exception_handling;

public class InvalidWinningStrategy extends RuntimeException{
    public InvalidWinningStrategy() {
        super();
    }

    public InvalidWinningStrategy(String message) {
        super(message);
    }

    public InvalidWinningStrategy(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidWinningStrategy(Throwable cause) {
        super(cause);
    }

    protected InvalidWinningStrategy(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
