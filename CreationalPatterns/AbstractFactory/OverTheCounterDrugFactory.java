public class OverTheCounterDrugFactory extends AbstractDrugFactory {
    @Override
    public Drug createDrug(String name) {
        return new OverTheCounterDrug(name, "Refer to Packaging for Usage Instructions");
    }
}