import java.util.Date;

public class DrugOrder {
    private String drugName;
    private int quantity;
    private String dosage;
    private Date deliveryDate;
    private String specialInstructions;

    public DrugOrder(String drugName, int quantity, String dosage, Date deliveryDate, String specialInstructions) {
        this.drugName = drugName;
        this.quantity = quantity;
        this.dosage = dosage;
        this.deliveryDate = deliveryDate;
        this.specialInstructions = specialInstructions;
    }

    public String getDrugName() {
        return drugName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }
}
