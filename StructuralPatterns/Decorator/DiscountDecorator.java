public class DiscountDecorator extends DrugDecorator {
    private double discountRate;

    public DiscountDecorator(DrugComponent decoratedDrug, double discountRate) {
        super(decoratedDrug);
        this.discountRate = discountRate;
    }

    @Override
    public String getDescription() {
        return decoratedDrug.getDescription() + " with discount";
    }

    @Override
    public double getPrice() {
        return decoratedDrug.getPrice() * (1 - discountRate);
    }
}