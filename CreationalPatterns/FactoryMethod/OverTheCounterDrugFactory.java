public class OverTheCounterDrugFactory extends DrugFactory {
    @Override
    public Drug createDrug(String name, String type) {
        return new OverTheCounterDrug(name, type, "Refer to Packaging for Usage Instructions");
    }
}