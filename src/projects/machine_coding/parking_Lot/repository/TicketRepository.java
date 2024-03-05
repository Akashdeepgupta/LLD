package projects.machine_coding.parking_Lot.repository;

import projects.machine_coding.parking_Lot.models.Ticket;

import java.util.HashMap;
// assume this like it's a ticket storing table <ticketId,Ticket>
public class TicketRepository {
    public static HashMap<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket getTicket(int ticketId){
        Ticket ticket = ticketMap.get(ticketId);
        if(ticket == null){
            //throw
        }
        return ticket;
    }

    public void putTicket(Ticket ticket){
        ticketMap.put(ticket.getId(),ticket);
        System.out.println("Ticket has been added successfully");
    }

    public HashMap<Integer, Ticket> getTicketMap() {
        return ticketMap;
    }

    public void setTicketMap(HashMap<Integer, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }
}
