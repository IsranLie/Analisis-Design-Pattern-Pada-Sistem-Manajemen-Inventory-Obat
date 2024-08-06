public class SupplierAAdapter extends SupplierAdapter {
    private SupplierAAPI supplierAAPI;

    public SupplierAAdapter(SupplierAAPI supplierAAPI, OrderProcessor orderProcessor) {
        super(orderProcessor);
        this.supplierAAPI = supplierAAPI;
    }

    @Override
    public void requestOrder(String drugName, int quantity) {
        supplierAAPI.sendOrder(drugName, quantity);
        orderProcessor.processOrder(drugName, quantity);
    }
}