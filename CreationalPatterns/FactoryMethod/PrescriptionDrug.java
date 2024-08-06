public class PrescriptionDrug extends Drug {
    private String dosage;

    public PrescriptionDrug(String name, String type, String dosage) {
        super(name, type);
        this.dosage = dosage;
    }

    @Override
    public String getInfo() {
        return "Prescription Drug: " + name + ", Dosage: " + dosage;
    }
}