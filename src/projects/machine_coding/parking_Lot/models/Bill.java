package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.BillStatus;

import java.time.LocalDateTime;
import java.util.PrimitiveIterator;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private BillStatus billStatus;
    private Gate exitGate;

    public Bill() {
    }

    public Bill(LocalDateTime exitTime, int amount, Ticket ticket) {
        this.exitTime = exitTime;
        this.amount = amount;
        this.ticket = ticket;
    }
}
