public class PrescriptionDrugFactory extends DrugFactory {
    @Override
    public Drug createDrug(String name, String type) {
        return new PrescriptionDrug(name, type, "Follow Doctor's Instructions");
    }
}