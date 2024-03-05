package projects.machine_coding.parking_Lot.repository;

import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.models.Ticket;

import java.util.HashMap;

// assume this like it's a ParkingLot storing table <ParkingLotId,ParkingLot>
public class ParkingLotRepository {
   public static HashMap<Integer, ParkingLot> ParkingLotMap;

    public ParkingLotRepository() {
        this.ParkingLotMap = new HashMap<>();
    }

    public ParkingLot getParkingLot(int ParkingLotId){
        ParkingLot parkingLot = ParkingLotMap.get(ParkingLotId);
        if(parkingLot == null){
            //throw
        }
        return parkingLot;
    }

    public void putParkingLot(ParkingLot parkingLot){
        ParkingLotMap.put(parkingLot.getId(),parkingLot);
        System.out.println("parkingLot has been added successfully");
    }
}
