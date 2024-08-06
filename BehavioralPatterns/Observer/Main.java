package obs3;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        Observer pharmacy = new PharmacyDepartment();
        Observer logistics = new LogisticsDepartment();

        inventorySystem.addObserver(pharmacy);
        inventorySystem.addObserver(logistics);

        // Melakukan perubahan pada inventory
        inventorySystem.changeInventory("New order of medicines received.");
    }
}
