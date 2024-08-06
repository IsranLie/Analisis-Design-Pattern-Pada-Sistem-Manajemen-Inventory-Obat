public class Main {
    public static void main(String[] args) {
        DrugComponent analgesics = new DrugComposite("Analgesics");
        DrugComponent antibiotics = new DrugComposite("Antibiotics");

        DrugComponent paracetamol = new DrugLeaf("Paracetamol", 10.0);
        DrugComponent ibuprofen = new DrugLeaf("Ibuprofen", 15.0);
        DrugComponent amoxicillin = new DrugLeaf("Amoxicillin", 25.0);

        analgesics.add(paracetamol);
        analgesics.add(ibuprofen);
        antibiotics.add(amoxicillin);

        DrugComponent allDrugs = new DrugComposite("All Drugs");
        allDrugs.add(analgesics);
        allDrugs.add(antibiotics);

        System.out.println("Total price of all drugs: " + allDrugs.getPrice());
    }
}