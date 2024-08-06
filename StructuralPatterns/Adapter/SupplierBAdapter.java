public class SupplierBAdapter extends SupplierAdapter {
    private SupplierBAPI supplierBAPI;

    public SupplierBAdapter(SupplierBAPI supplierBAPI, OrderProcessor orderProcessor) {
        super(orderProcessor);
        this.supplierBAPI = supplierBAPI;
    }

    @Override
    public void requestOrder(String drugName, int quantity) {
        supplierBAPI.sendOrder(drugName, quantity);
        orderProcessor.processOrder(drugName, quantity);
    }
}