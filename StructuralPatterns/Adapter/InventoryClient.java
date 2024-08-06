public class InventoryClient {
    private SupplierAdapter supplierAdapter;

    public InventoryClient(SupplierAdapter supplierAdapter) {
        this.supplierAdapter = supplierAdapter;
    }

    public void requestOrder(String drugName, int quantity) {
        supplierAdapter.requestOrder(drugName, quantity);
    }
}