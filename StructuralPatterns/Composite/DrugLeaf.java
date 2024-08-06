public class DrugLeaf extends DrugComponent {
    private String name;
    private double price;

    public DrugLeaf(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}