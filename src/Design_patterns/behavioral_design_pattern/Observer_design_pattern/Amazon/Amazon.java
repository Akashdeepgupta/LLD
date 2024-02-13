package Design_patterns.behavioral_design_pattern.Observer_design_pattern.Amazon;

import java.util.ArrayList;
import java.util.List;

// publisher class
// make this singleton as we do not want multiple List<OrderPlacedSubscriber> orderPlacedSubscribers
public class Amazon {
    private List<OrderPlacedSubscriber> orderPlacedSubscribers;

    public Amazon() {
        this.orderPlacedSubscribers = new ArrayList<>();
    }

    public void orderPlaced(){
        for(OrderPlacedSubscriber o : orderPlacedSubscribers){
            o.orderPlaceEvent();
        }
    }

    public void addOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscribers.add(orderPlacedSubscriber);
    }
    public void removeOrderPlaceSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        this.orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }
}
