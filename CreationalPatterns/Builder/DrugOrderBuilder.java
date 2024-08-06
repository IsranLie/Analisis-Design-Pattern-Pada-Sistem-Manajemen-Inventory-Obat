import java.util.Date;

public class DrugOrderBuilder {
    private String drugName;
    private int quantity;
    private String dosage;
    private Date deliveryDate;
    private String specialInstructions;

    public DrugOrderBuilder setDrugName(String drugName) {
        this.drugName = drugName;
        return this;
    }

    public DrugOrderBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public DrugOrderBuilder setDosage(String dosage) {
        this.dosage = dosage;
        return this;
    }

    public DrugOrderBuilder setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
        return this;
    }

    public DrugOrderBuilder setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
        return this;
    }

    public DrugOrder build() {
        return new DrugOrder(drugName, quantity, dosage, deliveryDate, specialInstructions);
    }
}