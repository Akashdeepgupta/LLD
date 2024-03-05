package projects.machine_coding.parking_Lot.exceptions;

public class ParkingSpotFullException extends RuntimeException{
    public ParkingSpotFullException() {
        super();
    }

    public ParkingSpotFullException(String message) {
        super(message);
    }

    public ParkingSpotFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParkingSpotFullException(Throwable cause) {
        super(cause);
    }

    protected ParkingSpotFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
