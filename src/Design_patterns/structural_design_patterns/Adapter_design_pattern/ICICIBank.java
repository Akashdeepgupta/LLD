package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class ICICIBank {
    public double checkBalance(String userToken){
        return 1000.0;
    }

    public int transferMoney(String fromUserToken, String toUserToken, double amount){
        return 1;
    }

    public boolean changePin(String userToken, int newPin, int currentPin){
        return true;
    }
}
