package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public interface BankApiAdapter {
    double checkBalance(User user);

    int doTransaction(User fromUser, User toUSer, double amount);
    boolean changePin(User user, int currentPin, int newPin);
}
