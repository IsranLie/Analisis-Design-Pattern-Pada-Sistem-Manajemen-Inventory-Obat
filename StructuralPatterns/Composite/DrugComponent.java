public abstract class DrugComponent {
    public void add(DrugComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(DrugComponent component) {
        throw new UnsupportedOperationException();
    }

    public DrugComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public abstract String getName();
    public abstract double getPrice();
}