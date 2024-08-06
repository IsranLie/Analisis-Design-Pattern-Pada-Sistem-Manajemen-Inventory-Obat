public class CancelOrderCommand implements Command {
    private int orderId;

    public CancelOrderCommand(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void execute() {
        System.out.println("Cancelling order with ID: " + orderId);        
    }
}