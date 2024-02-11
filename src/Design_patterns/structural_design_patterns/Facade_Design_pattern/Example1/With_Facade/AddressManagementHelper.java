package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class AddressManagementHelper{
    private AddressManagementHelper adr;

    public void verify(){
        adr.verifyPincode();
        adr.verifyAddress();
    }

    private void verifyPincode() {
    }

    private void verifyAddress() {
        
    }
}
