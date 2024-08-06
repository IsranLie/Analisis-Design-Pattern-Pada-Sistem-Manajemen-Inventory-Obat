import java.util.ArrayList;
import java.util.List;

public class DrugComposite extends DrugComponent {
    private List<DrugComponent> children = new ArrayList<>();
    private String name;

    public DrugComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(DrugComponent component) {
        children.add(component);
    }

    @Override
    public void remove(DrugComponent component) {
        children.remove(component);
    }

    @Override
    public DrugComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (DrugComponent component : children) {
            total += component.getPrice();
        }
        return total;
    }
}