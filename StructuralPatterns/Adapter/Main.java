public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        SupplierAAPI supplierAAPI = new SupplierAAPI();
        SupplierAdapter supplierAAdapter = new SupplierAAdapter(supplierAAPI, orderProcessor);

        SupplierBAPI supplierBAPI = new SupplierBAPI();
        SupplierAdapter supplierBAdapter = new SupplierBAdapter(supplierBAPI, orderProcessor);

        InventoryClient clientA = new InventoryClient(supplierAAdapter);
        InventoryClient clientB = new InventoryClient(supplierBAdapter);

        clientA.requestOrder("Amoxicillin", 100);
        clientB.requestOrder("Paracetamol", 200);
    }
}