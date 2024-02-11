package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class PaymentManagementHelper {
    private PaymentManagementHelper pay; 
    
    public void pay(){
        pay.initiatePayment();
        pay.verifyPayment();
    }

    private void initiatePayment() {
    }

    private void verifyPayment() {
        
    }
}
