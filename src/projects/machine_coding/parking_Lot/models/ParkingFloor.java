package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.ParkingFloorStatus;

import java.util.List;

public class ParkingFloor extends BaseModel{
    int floorNumber;
    List<ParkingSpot> parkingSpots;

    ParkingFloorStatus parkingFloorStatus;
    Gate entryGate;
    Gate exitGate;

    public ParkingFloor() {
    }

    public ParkingFloor(int floorNumber, List<ParkingSpot> parkingSpots, ParkingFloorStatus parkingFloorStatus, Gate entryGate, Gate exitGate) {
        this.floorNumber = floorNumber;
        this.parkingSpots = parkingSpots;
        this.parkingFloorStatus = parkingFloorStatus;
        this.entryGate = entryGate;
        this.exitGate = exitGate;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
