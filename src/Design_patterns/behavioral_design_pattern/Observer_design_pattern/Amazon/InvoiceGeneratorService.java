package Design_patterns.behavioral_design_pattern.Observer_design_pattern;

public class InvoiceGeneratorService implements OrderPlacedSubscriber{
    @Override
    public void orderPlaceEvent() {
        System.out.println("generate Invoice");
    }
}
