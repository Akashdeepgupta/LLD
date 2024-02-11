package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class ICICIBankApiAdapter implements BankApiAdapter{
    private ICICIBank iciciBank = new ICICIBank();
    @Override
    public double checkBalance(User user) {
        return iciciBank.checkBalance(generateToken(user));
    }

    @Override
    public int doTransaction(User fromUser, User toUSer, double amount) {
        return iciciBank.transferMoney(generateToken(fromUser),generateToken(toUSer),amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBank.changePin(generateToken(user),newPin,currentPin);
    }

    public String generateToken(User user){
        return user.getUserName()+user.getPassword();//some random userToken
    }
}
