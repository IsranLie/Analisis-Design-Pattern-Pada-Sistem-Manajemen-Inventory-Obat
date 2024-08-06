public class DrugFacade {
    private InventoryManager inventoryManager;
    private OrderProcessor orderProcessor;
    private StockMonitor stockMonitor;

    public DrugFacade(InventoryManager inventoryManager, OrderProcessor orderProcessor, StockMonitor stockMonitor) {
        this.inventoryManager = inventoryManager;
        this.orderProcessor = orderProcessor;
        this.stockMonitor = stockMonitor;
    }

    public void orderDrug(String drugName, int quantity) {
        if (stockMonitor.checkStockLevel(drugName) >= quantity) {
            orderProcessor.processOrder(drugName, quantity);
            inventoryManager.updateInventory(drugName, -quantity);
            System.out.println("Order placed for " + quantity + " units of " + drugName);
        } else {
            System.out.println("Insufficient stock for " + drugName);
        }
    }

    public void checkStock(String drugName) {
        int stock = inventoryManager.getStock(drugName);
        System.out.println("Stock for " + drugName + ": " + stock);
    }
}