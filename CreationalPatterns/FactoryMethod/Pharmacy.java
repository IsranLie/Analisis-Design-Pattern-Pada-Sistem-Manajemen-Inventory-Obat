public class Pharmacy {
    private DrugFactory drugFactory;

    public Pharmacy(DrugFactory drugFactory) {
        this.drugFactory = drugFactory;
    }

    public Drug orderDrug(String name, String type) {
        return drugFactory.createDrug(name, type);
    }

    public static void main(String[] args) {
        Pharmacy prescriptionPharmacy = new Pharmacy(new PrescriptionDrugFactory());
        Drug prescriptionDrug = prescriptionPharmacy.orderDrug("Amoxicillin", "Prescription");
        System.out.println(prescriptionDrug.getInfo());

        Pharmacy otcPharmacy = new Pharmacy(new OverTheCounterDrugFactory());
        Drug otcDrug = otcPharmacy.orderDrug("Paracetamol", "OTC");
        System.out.println(otcDrug.getInfo());
    }
}