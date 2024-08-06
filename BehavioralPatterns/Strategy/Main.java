public class Main {
    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();

        // Using NormalOrderStrategy
        orderContext.setOrderStrategy(new NormalOrderStrategy());
        orderContext.executeOrder("Aspirin", 20);

        // Using EmergencyOrderStrategy
        orderContext.setOrderStrategy(new EmergencyOrderStrategy());
        orderContext.executeOrder("Ibuprofen", 50);

        // Using BulkOrderStrategy
        orderContext.setOrderStrategy(new BulkOrderStrategy());
        orderContext.executeOrder("Paracetamol", 100);
    }
}