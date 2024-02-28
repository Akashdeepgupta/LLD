package projects.machine_coding.tic_tac_toe.exception_handling;

public class InvalidBotPlayingStrategy extends RuntimeException{
    public InvalidBotPlayingStrategy() {
        super();
    }

    public InvalidBotPlayingStrategy(String message) {
        super(message);
    }

    public InvalidBotPlayingStrategy(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBotPlayingStrategy(Throwable cause) {
        super(cause);
    }

    protected InvalidBotPlayingStrategy(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
