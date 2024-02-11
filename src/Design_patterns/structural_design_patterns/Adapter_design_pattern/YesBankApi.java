package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class YesBankApi {
    public long getBalance(String username, String password){
        return 1000;
    }

    public char doTransaction(String fromUserName, String toUserName, String fromUserPassword, double amount){
        return 'y';
    }

    public boolean changePin(String userName, String password, int currentPin, int newPin){
        return true;
    }
}
