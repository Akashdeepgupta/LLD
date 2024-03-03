package projects.machine_coding.parking_Lot;

import projects.machine_coding.parking_Lot.controller.InitialisationController;
import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.repository.GateRepository;
import projects.machine_coding.parking_Lot.repository.ParkingFloorRepository;
import projects.machine_coding.parking_Lot.repository.ParkingLotRepository;
import projects.machine_coding.parking_Lot.repository.ParkingSpotRepository;
import projects.machine_coding.parking_Lot.service.initialisation_service.InitialisationService;

public class ParkingLotMain {
    public static void main(String[] args) {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();
        GateRepository gateRepository = new GateRepository();

        InitialisationService initialisationService = new InitialisationService(
                parkingLotRepository,
                parkingFloorRepository,
                parkingSpotRepository,
                gateRepository
        );
        InitialisationController initialisationController = new InitialisationController(initialisationService);
        ParkingLot parkingLot = initialisationController.getInitialisationService();
        System.out.println(parkingLot);
    }
}
