import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private Map<String, Integer> inventory = new HashMap<>();

    public void updateInventory(String drugName, int quantity) {
        inventory.put(drugName, inventory.getOrDefault(drugName, 0) + quantity);
    }

    public int getStock(String drugName) {
        return inventory.getOrDefault(drugName, 0);
    }
}