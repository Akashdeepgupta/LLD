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

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", parkingSpot=" + parkingSpot +
                ", vehicle=" + vehicle +
                ", entryGate=" + entryGate +
                '}';
    }
}
