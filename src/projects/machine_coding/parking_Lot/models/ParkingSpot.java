package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.ParkingSpotStatus;
import projects.machine_coding.parking_Lot.models.enums.VehicleType;

public class ParkingSpot extends BaseModel{
    private int number;
    private VehicleType vehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private Vehicle vehicle;

    public ParkingSpot() {
    }

    public ParkingSpot( int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.vehicle = vehicle;
    }
}
