package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class InventoryManagementHelper{
    private InventoryManagementHelper inv;

    public void checkAndUpdateInventory(){
        inv.checkCurrentCount();
        inv.stockUpdate();
        inv.priceCheck();
    }

    private void priceCheck() {
    }

    private void stockUpdate() {
    }

    private void checkCurrentCount() {
    }
}
