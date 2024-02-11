package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class SupplyChainManagementHelper{
    SupplyChainManagementHelper scm;
    
    public void ShipAndTrackOrder(){
        scm.getTimeToDelivery();
        scm.initiateOrderShipment();
        scm.getTrackingLink();
    }

    private void getTrackingLink() {
    }

    private void initiateOrderShipment() {
    }

    private void getTimeToDelivery() {
    }
}
