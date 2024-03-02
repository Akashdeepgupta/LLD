package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.ParkingSpotStatus;
import projects.machine_coding.parking_Lot.models.enums.VehicleType;

public class EvParkingSpot extends ParkingSpot{
    String charger;

    public EvParkingSpot(String charger) {
        this.charger = charger;
    }

    public EvParkingSpot(int number, VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, Vehicle vehicle, String charger) {
        super(number, vehicleType, parkingSpotStatus, vehicle);
        this.charger = charger;
    }
}
