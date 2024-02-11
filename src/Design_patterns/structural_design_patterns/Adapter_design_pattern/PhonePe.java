package Design_patterns.structural_design_patterns.Adapter_design_pattern;

public class PhonePe {
    BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = new YesBankApiAdapter();
//        this.bankApiAdapter = new ICICIBankApiAdapter(); just need to change this one line
    }

    public void checkBalance(User user){
        double d = bankApiAdapter.checkBalance(user);
        System.out.println("Balance = "+ d);
    }

    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankApiAdapter.doTransaction(fromUser,toUser,amount) < amount){
            System.out.println("transaction failed due to low balance");
        }
        int status = bankApiAdapter.doTransaction(fromUser,toUser,amount);
        switch (status){
            case 1:
                System.out.println("SUCCESFUL");
                break;
            case 0 :
                System.out.println("FAILED");
                break;
            default:
                System.out.println("IN PROGRESS");
                break;
        }
        //deduct amount and other further operations
    }
}
