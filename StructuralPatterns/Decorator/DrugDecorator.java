public abstract class DrugDecorator extends DrugComponent {
    protected DrugComponent decoratedDrug;

    public DrugDecorator(DrugComponent decoratedDrug) {
        this.decoratedDrug = decoratedDrug;
    }

    @Override
    public String getDescription() {
        return decoratedDrug.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedDrug.getPrice();
    }
}