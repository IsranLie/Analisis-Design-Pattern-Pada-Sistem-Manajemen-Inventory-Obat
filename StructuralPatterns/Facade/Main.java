public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        OrderProcessor orderProcessor = new OrderProcessor();
        StockMonitor stockMonitor = new StockMonitor();

        DrugFacade drugFacade = new DrugFacade(inventoryManager, orderProcessor, stockMonitor);

        inventoryManager.updateInventory("Aspirin", 50);
        drugFacade.checkStock("Aspirin");
        drugFacade.orderDrug("Aspirin", 30);
        drugFacade.checkStock("Aspirin");
    }
}