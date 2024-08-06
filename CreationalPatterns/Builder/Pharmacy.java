import java.util.Date;

public class Pharmacy {
    private DrugOrderBuilder orderBuilder;

    public Pharmacy(DrugOrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public void createOrder() {
        DrugOrder order = orderBuilder
                .setDrugName("Paracetamol")
                .setQuantity(100)
                .setDosage("500mg")
                .setDeliveryDate(new Date())
                .setSpecialInstructions("Store in a cool, dry place")
                .build();

        System.out.println("Order created: " + order.getDrugName() + ", Quantity: " + order.getQuantity());
    }

    public static void main(String[] args) {
        DrugOrderBuilder builder = new DrugOrderBuilder();
        Pharmacy pharmacy = new Pharmacy(builder);
        pharmacy.createOrder();
    }
}