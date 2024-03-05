package projects.machine_coding.parking_Lot.service.ticket_service;

import projects.machine_coding.parking_Lot.models.*;
import projects.machine_coding.parking_Lot.repository.ParkingLotRepository;
import projects.machine_coding.parking_Lot.repository.ParkingSpotRepository;
import projects.machine_coding.parking_Lot.repository.TicketRepository;
import projects.machine_coding.parking_Lot.service.spot_allocation_strategy.SpotAllocationFactory;
import projects.machine_coding.parking_Lot.service.spot_allocation_strategy.SpotAllocationStrategy;
import projects.machine_coding.parking_Lot.service.spot_allocation_strategy.SpotAllocationStrategyName;

import java.time.LocalDateTime;

public class TicketService {
    LocalDateTime entryTime;
    Gate entryGate;
    Vehicle vehicle;
    TicketRepository ticketRepository;
    ParkingLot parkingLot;


    public TicketService(LocalDateTime entryTime,  Vehicle vehicle) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        ticketRepository = new TicketRepository();
    }

    public Ticket getTicket(){
        SpotAllocationStrategy spotAllocationStrategy = SpotAllocationFactory.getSpotAllocationStrategy(SpotAllocationStrategyName.LINEARSPOTALLOCATIONSTRATEGY);
        CarParkingDetails carParkingDetails = spotAllocationStrategy.getSpot(vehicle, ParkingLotRepository.ParkingLotMap.get(1));
        Ticket ticket = new Ticket();
        ticket.setEntryTime(entryTime.now());
        ticket.setEntryGate(carParkingDetails.getParkingFloor().getEntryGate());
        ticket.setVehicle(vehicle);
        ticket.setParkingSpot(carParkingDetails.getParkingSpot());
        ticketRepository.putTicket(ticket);
        return ticket;
    }
}
