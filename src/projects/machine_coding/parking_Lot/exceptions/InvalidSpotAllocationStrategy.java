package projects.machine_coding.parking_Lot.exceptions;

public class InvalidSpotAllocationStrategy extends RuntimeException{
    public InvalidSpotAllocationStrategy() {
        super();
    }

    public InvalidSpotAllocationStrategy(String message) {
        super(message);
    }

    public InvalidSpotAllocationStrategy(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSpotAllocationStrategy(Throwable cause) {
        super(cause);
    }

    protected InvalidSpotAllocationStrategy(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
