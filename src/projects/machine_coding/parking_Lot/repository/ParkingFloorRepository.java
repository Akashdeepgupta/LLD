package projects.machine_coding.parking_Lot.repository;

import projects.machine_coding.parking_Lot.models.ParkingFloor;

import java.util.HashMap;

// assume this like it's a ParkingFloor storing table <ParkingFloorId,ParkingFloor>
public class ParkingFloorRepository {
    public static HashMap<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepository() {
        this.parkingFloorMap = new HashMap<>();
    }

    public ParkingFloor getParkingFloor(int parkingFloorId){
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        if(parkingFloor == null){
            //throw
        }
        return parkingFloor;
    }

    public void putParkingFloor(ParkingFloor ticket){
        parkingFloorMap.put(ticket.getId(),ticket);
        System.out.println("ParkingFloor has been added successfully");
    }
}
