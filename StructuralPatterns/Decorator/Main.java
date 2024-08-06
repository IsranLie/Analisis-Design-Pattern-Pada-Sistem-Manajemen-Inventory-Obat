public class Main {
    public static void main(String[] args) {
        DrugComponent basicDrug = new BasicDrug("Amoxicillin", 100);

        // Adding discount
        DrugComponent discountedDrug = new DiscountDecorator(basicDrug, 0.1);

        // Adding special packaging
        DrugComponent packagedDrug = new SpecialPackagingDecorator(discountedDrug, 5);

        // Adding label
        DrugComponent labeledDrug = new LabelDecorator(packagedDrug, "Take twice daily");

        System.out.println(labeledDrug.getDescription() + " costs " + labeledDrug.getPrice());
    }
}