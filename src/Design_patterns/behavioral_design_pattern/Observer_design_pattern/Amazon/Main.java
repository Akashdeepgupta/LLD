package Design_patterns.behavioral_design_pattern.Observer_design_pattern.Amazon;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        InvoiceGeneratorService invoiceGeneratorService = new InvoiceGeneratorService();
        Amazon amazon = new Amazon();
        amazon.addOrderPlaceSubscriber(notificationService);
        amazon.addOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();

        amazon.removeOrderPlaceSubscriber(invoiceGeneratorService);

        amazon.orderPlaced();
    }
}
