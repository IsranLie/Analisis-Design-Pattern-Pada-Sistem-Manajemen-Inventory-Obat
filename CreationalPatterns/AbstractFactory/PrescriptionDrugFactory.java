public class PrescriptionDrugFactory extends AbstractDrugFactory {
    @Override
    public Drug createDrug(String name) {
        return new PrescriptionDrug(name, "Follow Doctor's Instructions");
    }
}