public class SpecialPackagingDecorator extends DrugDecorator {
    private double packagingCost;

    public SpecialPackagingDecorator(DrugComponent decoratedDrug, double packagingCost) {
        super(decoratedDrug);
        this.packagingCost = packagingCost;
    }

    @Override
    public String getDescription() {
        return decoratedDrug.getDescription() + " with special packaging";
    }

    @Override
    public double getPrice() {
        return decoratedDrug.getPrice() + packagingCost;
    }
}