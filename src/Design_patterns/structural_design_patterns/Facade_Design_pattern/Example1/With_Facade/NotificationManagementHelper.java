package Design_patterns.structural_design_patterns.Facade_Design_pattern.Example1.With_Facade;

public class NotificationManagementHelper{
    private NotificationManagementHelper nfm;

    public void Notify(){
        nfm.sendSms();
        nfm.SendEmail();
    }

    private void sendSms() {
    }

    private void SendEmail() {

    }
}
