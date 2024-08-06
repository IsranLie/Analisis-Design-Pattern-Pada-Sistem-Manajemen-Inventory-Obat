import java.util.Map;
import java.util.HashMap;

public class InventoryManager {
    private static InventoryManager instance;
    private Map<String, Integer> stock;

    private InventoryManager() {
        stock = new HashMap<>();
    }

    public static InventoryManager getInstance() {
        if (instance == null) {
            instance = new InventoryManager();
        }
        return instance;
    }

    public int getStock(String drugName) {
        return stock.getOrDefault(drugName, 0);
    }

    public void updateStock(String drugName, int quantity) {
        stock.put(drugName, getStock(drugName) + quantity);
    }

    public void addDrug(String drugName, int initialStock) {
        stock.put(drugName, initialStock);
    }
}