public class PrescriptionDrug extends Drug {
    private String dosage;

    public PrescriptionDrug(String name, String dosage) {
        super(name, "Prescription");
        this.dosage = dosage;
    }

    @Override
    public String getInfo() {
        return "Prescription Drug: " + name + ", Dosage: " + dosage;
    }
}