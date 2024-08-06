public class Pharmacy {
    private AbstractDrugFactory drugFactory;

    public Pharmacy(AbstractDrugFactory drugFactory) {
        this.drugFactory = drugFactory;
    }

    public Drug orderDrug(String name) {
        return drugFactory.createDrug(name);
    }

    public static void main(String[] args) {
        Pharmacy prescriptionPharmacy = new Pharmacy(new PrescriptionDrugFactory());
        Drug prescriptionDrug = prescriptionPharmacy.orderDrug("Amoxicillin");
        System.out.println(prescriptionDrug.getInfo());

        Pharmacy otcPharmacy = new Pharmacy(new OverTheCounterDrugFactory());
        Drug otcDrug = otcPharmacy.orderDrug("Paracetamol");
        System.out.println(otcDrug.getInfo());
    }
}