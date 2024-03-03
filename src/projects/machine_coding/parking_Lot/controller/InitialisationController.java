package projects.machine_coding.parking_Lot.controller;

import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.service.initialisation_service.InitialisationService;

public class InitialisationController {
    InitialisationService initialisationService;

    public InitialisationController(InitialisationService initialisationService) {
        this.initialisationService = initialisationService;
    }

    public ParkingLot getInitialisationService() {
        return initialisationService.init();
    }
}
