package Design_patterns.behavioral_design_pattern.Observer_design_pattern.Amazon;

import Design_patterns.behavioral_design_pattern.Observer_design_pattern.Amazon.OrderPlacedSubscriber;

public class NotificationService implements OrderPlacedSubscriber {
    @Override
    public void orderPlaceEvent() {
        System.out.println("send sms to user");
        System.out.println("Send email to user");
    }
}
