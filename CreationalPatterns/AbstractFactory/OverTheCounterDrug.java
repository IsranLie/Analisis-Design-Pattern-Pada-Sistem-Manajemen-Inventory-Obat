public class OverTheCounterDrug extends Drug {
    private String usageInstructions;

    public OverTheCounterDrug(String name, String usageInstructions) {
        super(name, "OverTheCounter");
        this.usageInstructions = usageInstructions;
    }

    @Override
    public String getInfo() {
        return "Over The Counter Drug: " + name + ", Usage Instructions: " + usageInstructions;
    }
}