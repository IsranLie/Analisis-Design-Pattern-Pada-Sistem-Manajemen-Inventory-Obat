public abstract class SupplierAdapter {
    protected OrderProcessor orderProcessor;

    public SupplierAdapter(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }

    public abstract void requestOrder(String drugName, int quantity);
}