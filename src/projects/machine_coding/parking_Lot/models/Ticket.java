package projects.machine_coding.parking_Lot.models;

import java.time.LocalDateTime;

public class Ticket extends BaseModel{
    private LocalDateTime entryTime;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private Gate entryGate;

    public Ticket() {
    }

    public Ticket(LocalDateTime entryTime, ParkingSpot parkingSpot, Vehicle vehicle, Gate entryGate) {
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryGate = entryGate;
    }
}
