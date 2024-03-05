package projects.machine_coding.parking_Lot.service.spot_allocation_strategy;

import projects.machine_coding.parking_Lot.exceptions.ParkingSpotFullException;
import projects.machine_coding.parking_Lot.models.*;
import projects.machine_coding.parking_Lot.models.enums.ParkingSpotStatus;

public class LinearSpotAllocationStrategy implements SpotAllocationStrategy{
    ParkingLot parkingLot;

    public LinearSpotAllocationStrategy() {
    }

    @Override
    public CarParkingDetails getSpot(Vehicle vehicle, ParkingLot parkingLot) {
        for(ParkingFloor parkingFloor : parkingLot.getParkingFloors() ){
            for(ParkingSpot parkingSpot : parkingFloor.getParkingSpots()){
                if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY) && parkingSpot.getVehicleType().equals(vehicle.getVehicleType())){
                    CarParkingDetails carParkingDetails = new CarParkingDetails(parkingFloor,parkingSpot);
                    carParkingDetails.getParkingSpot().setParkingSpotStatus(ParkingSpotStatus.OCCUPIED);
                    carParkingDetails.getParkingSpot().setVehicle(vehicle);
                    return carParkingDetails;
                }
            }
        }
        throw new ParkingSpotFullException("No Parking space is available come again next time");
    }
}
