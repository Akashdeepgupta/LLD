package projects.machine_coding.parking_Lot.repository;

import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.models.ParkingSpot;

import java.util.HashMap;

// assume this like it's a ParkingSpot storing table <ParkingSpotId,ParkingSpot>
public class ParkingSpotRepository {
   public static HashMap<Integer, ParkingSpot> ParkingSpotMap;

    public ParkingSpotRepository() {
        this.ParkingSpotMap = new HashMap<>();
    }

    public ParkingSpot getParkingSpot(int ParkingSpotId){
        ParkingSpot parkingSpot = ParkingSpotMap.get(ParkingSpotId);
        if(parkingSpot == null){
            //throw
        }
        return parkingSpot;
    }

    public void putParkingSpot(ParkingSpot parkingSpot){
        ParkingSpotMap.put(parkingSpot.getId(),parkingSpot);
        System.out.println("parkingLot has been added successfully");
    }
}
