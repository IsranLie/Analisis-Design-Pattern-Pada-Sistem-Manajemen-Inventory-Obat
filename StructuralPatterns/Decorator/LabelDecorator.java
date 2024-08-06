public class LabelDecorator extends DrugDecorator {
    private String labelInfo;

    public LabelDecorator(DrugComponent decoratedDrug, String labelInfo) {
        super(decoratedDrug);
        this.labelInfo = labelInfo;
    }

    @Override
    public String getDescription() {
        return decoratedDrug.getDescription() + " with label: " + labelInfo;
    }

    @Override
    public double getPrice() {
        return decoratedDrug.getPrice();
    }
}