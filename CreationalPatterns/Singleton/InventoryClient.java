public class InventoryClient {
    private InventoryManager inventoryManager;

    public InventoryClient() {
        inventoryManager = InventoryManager.getInstance();
    }

    public void useInventoryManager() {
        inventoryManager.addDrug("Paracetamol", 100);
        System.out.println("Stock of Paracetamol: " + inventoryManager.getStock("Paracetamol"));
        inventoryManager.updateStock("Paracetamol", 50);
        System.out.println("Updated Stock of Paracetamol: " + inventoryManager.getStock("Paracetamol"));
    }

    public static void main(String[] args) {
        InventoryClient client = new InventoryClient();
        client.useInventoryManager();
    }
}