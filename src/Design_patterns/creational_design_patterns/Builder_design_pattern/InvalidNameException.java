package Design_patterns.creational_design_patterns.Builder_design_pattern;

public class InvalidNameException extends RuntimeException{
    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }

    public InvalidNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNameException(Throwable cause) {
        super(cause);
    }

    public InvalidNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
