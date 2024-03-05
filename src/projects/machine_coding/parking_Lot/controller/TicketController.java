package projects.machine_coding.parking_Lot.controller;

import projects.machine_coding.parking_Lot.models.*;
import projects.machine_coding.parking_Lot.repository.TicketRepository;
import projects.machine_coding.parking_Lot.service.ticket_service.TicketService;

import java.time.LocalDateTime;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket getTicket(){
        Ticket ticket = ticketService.getTicket();
        return ticket;
    }
}
