public class OrderDrugCommand implements Command {
    private String drugName;
    private int quantity;

    public OrderDrugCommand(String drugName, int quantity) {
        this.drugName = drugName;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        System.out.println("Ordering " + quantity + " units of " + drugName);
    }
}