package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class Amazon {
    private InventoryManagementHelper invHelper;
    private AddressManagementHelper adrHelper;
    private PaymentManagementHelper payHelper;
    private SupplyChainManagementHelper scmHelper;
    private NotificationManagementHelper nfmHelper;

    public void placeOrder(int product_id, int quanity){
        invHelper.checkAndUpdateInventory();
        adrHelper.verify();
        payHelper.pay();
        scmHelper.ShipAndTrackOrder();
        nfmHelper.Notify();
    }
}


