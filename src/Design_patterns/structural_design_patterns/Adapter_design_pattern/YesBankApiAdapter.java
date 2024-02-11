package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class YesBankApiAdapter implements BankApiAdapter{

    private  YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankApi.getBalance(user.getUserName(),user.getPassword());
        return (double) balance;
    }

    @Override
    public int doTransaction(User fromUser, User toUSer, double amount) {
        char result = yesBankApi.doTransaction(fromUser.getUserName(),toUSer.getUserName(), fromUser.getPassword(), amount);
        if (result =='y'){
            return 1;
        } else if (result == 'n') {
            return 0;
        }else {
            return 2;
        }

    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankApi.changePin(user.getUserName(), user.getPassword(),currentPin,newPin);
    }
}
