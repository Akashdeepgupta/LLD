package projects.machine_coding.parking_Lot.service.initialisation_service;

import projects.machine_coding.parking_Lot.models.Gate;
import projects.machine_coding.parking_Lot.models.ParkingFloor;
import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.models.ParkingSpot;
import projects.machine_coding.parking_Lot.models.enums.*;
import projects.machine_coding.parking_Lot.repository.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitialisationService {
    ParkingLotRepository parkingLotRepository;
    ParkingSpotRepository parkingSpotRepository;

    ParkingFloorRepository parkingFloorRepository;
    TicketRepository ticketRepository;
    GateRepository gateRepository;

    static int parkingLotCounter = 1;

    public InitialisationService() {
    }

    public InitialisationService(ParkingLotRepository parkingLotRepository,  ParkingFloorRepository parkingFloorRepository, ParkingSpotRepository parkingSpotRepository,GateRepository gateRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotRepository = parkingSpotRepository;
        this.parkingFloorRepository = parkingFloorRepository;
        this.gateRepository = gateRepository;
    }

    public ParkingLot init(){
        Scanner sc = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(parkingLotCounter++);
        System.out.println("Enter the Name of the parking Lot you want to create");
        String name = sc.nextLine();
        parkingLot.setName(name);
        System.out.println("Enter the address of parking lot");
        String address = sc.nextLine();
        parkingLot.setAddress(address);
        System.out.println("Enter the capacity of Parking Lot");
        int capacity = sc.nextInt();
        parkingLot.setCapacity(capacity);
        System.out.println("Enter the number of Floors in Parking Lot");
        int numberOfFloors = sc.nextInt();

        parkingLot.setParkingLotStatus(ParkingLotStatus.OPEN);
        parkingLot.setVehicleTypesSupported(List.of(VehicleType.LUXE,VehicleType.EV,VehicleType.TWO_WHEELER,VehicleType.FOUR_WHEELER));

        List<ParkingFloor> parkingFloors = new ArrayList<>();

        for (int i = 1; i <= numberOfFloors; i++) {

            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.AVAILABLE);

            //entry gate
            Gate entryGate = new Gate();
            entryGate.setId(i*10);
            entryGate.setGateNumber(i*10);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setOperatorName("Operator" + i*10);
            parkingFloor.setEntryGate(entryGate);
            gateRepository.putGate(entryGate);

            //exit Gate
            Gate exitGate = new Gate();
            exitGate.setId(i*10+1);
            exitGate.setGateNumber(i*10+1);
            exitGate.setGateType(GateType.ENTRY);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setOperatorName("Operator" + (i*10+1));
            parkingFloor.setExitGate(exitGate);
            gateRepository.putGate(exitGate);

            parkingFloors.add(parkingFloor);
            parkingFloorRepository.putParkingFloor(parkingFloor);


            int totalNumberOfSpotPerFloor = capacity/numberOfFloors;
            List<ParkingSpot> parkingSpots = new ArrayList<>();
            for (int j = 1; j <= totalNumberOfSpotPerFloor; j++) {
                ParkingSpot parkingSpot = getParkingSpot(j, i);
                parkingSpots.add(parkingSpot);
                parkingSpotRepository.putParkingSpot(parkingSpot);
            }
            parkingFloor.setParkingSpots(parkingSpots);


        }
        parkingLotRepository.putParkingLot(parkingLot);
        parkingLot.setParkingFloors(parkingFloors);
        return parkingLotRepository.getParkingLot(parkingLot.getId());
    }

    private static ParkingSpot getParkingSpot(int j, int i) {
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.setId(j);
        parkingSpot.setNumber(i *100 + j);
        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
        if(i <=3){
            parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
        } else if (i >=4 && i <=5) {
            parkingSpot.setVehicleType(VehicleType.TWO_WHEELER);
        } else if (i >=6 && i <=7) {
            parkingSpot.setVehicleType(VehicleType.EV);
        }
        else{
            parkingSpot.setVehicleType(VehicleType.LUXE);
        }
        return parkingSpot;
    }
}
