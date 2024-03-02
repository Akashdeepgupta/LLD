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
}
