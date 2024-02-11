package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.Without_Facade;

public class Amazon {
    private InventoryManagement inv;
    private AddressManagement adr;
    private PaymentManagement pay;
    private SupplyChainManagement scm;
    private NotificationManagement nfm;

    public void PlaceOrder(int product_id, int quantity){
        inv.checkCurrentCount();
        inv.stockUpdate();
        inv.priceCheck();

        adr.verifyPincode();
        adr.verifyAddress();

        pay.initiatePayment();
        pay.verifyPayment();

        scm.getTimeToDelivery();
        scm.initialOrderShipment();
        scm.getTrackingLink();

        nfm.sendSms();
        nfm.semEmail();

    }
}

