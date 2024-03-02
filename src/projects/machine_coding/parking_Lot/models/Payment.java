package projects.machine_coding.parking_Lot.models;

import projects.machine_coding.parking_Lot.models.enums.PaymentMode;
import projects.machine_coding.parking_Lot.models.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private double amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private String transactionReferenceNumber;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(int amount, PaymentMode paymentMode, Bill bill, String transactionReferenceNumber, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.transactionReferenceNumber = transactionReferenceNumber;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }
}
