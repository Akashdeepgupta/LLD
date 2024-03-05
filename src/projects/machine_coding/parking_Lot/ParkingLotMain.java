package projects.machine_coding.parking_Lot;

import projects.machine_coding.parking_Lot.controller.InitialisationController;
import projects.machine_coding.parking_Lot.controller.TicketController;
import projects.machine_coding.parking_Lot.models.ParkingLot;
import projects.machine_coding.parking_Lot.models.Ticket;
import projects.machine_coding.parking_Lot.models.Vehicle;
import projects.machine_coding.parking_Lot.models.enums.VehicleType;
import projects.machine_coding.parking_Lot.repository.*;
import projects.machine_coding.parking_Lot.service.initialisation_service.InitialisationService;
import projects.machine_coding.parking_Lot.service.ticket_service.TicketService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        System.out.println("What you want to do:");
        System.out.println("1. enter/park vehicle");
        System.out.println("2. exit from parking lot");
        int ans = sc.nextInt();
        if(ans == 1){

            Vehicle vehicle = new Vehicle();
            System.out.println("Welcome to our parking lot");
            System.out.println("Please enter the vehicle details");
            System.out.println("Please enter the vehicle number");
            String number = sc.next();
            vehicle.setVehicleNumber(number);
            System.out.println("Please enter the vehicle color");
            String color = sc.next();
            vehicle.setColor(color);
            System.out.println("Please choose the vehicle type -> 1. Car and 2. Bike");
            int vehicleType = sc.nextInt();
            if(vehicleType == 1){
                vehicle.setVehicleType(VehicleType.FOUR_WHEELER);
            } else {
                vehicle.setVehicleType(VehicleType.TWO_WHEELER);
            }
            TicketService ticketService = new TicketService(LocalDateTime.now(),vehicle);
            TicketController ticketController = new TicketController(ticketService);
            Ticket ticket = ticketController.getTicket();
            System.out.println("Ticket details :" + ticket);
        }
        else{
            System.out.println("yet to write logic for exit");
        }
    }
}
