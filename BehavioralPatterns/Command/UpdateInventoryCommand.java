public class UpdateInventoryCommand implements Command {
    private String drugName;
    private int quantity;

    public UpdateInventoryCommand(String drugName, int quantity) {
        this.drugName = drugName;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        System.out.println("Updating inventory: " + quantity + " units of " + drugName);        
    }
}