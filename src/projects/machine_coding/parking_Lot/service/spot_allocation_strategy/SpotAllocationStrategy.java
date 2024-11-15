package projects.machine_coding.parking_Lot.service.spot_allocation_strategy;

import projects.machine_coding.parking_Lot.models.CarParkingDetails;
import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.models.ParkingSpot;
import projects.machine_coding.parking_Lot.models.Vehicle;

public interface SpotAllocationStrategy {
    CarParkingDetails getSpot(Vehicle vehicle, ParkingLot parkingLot);
}
