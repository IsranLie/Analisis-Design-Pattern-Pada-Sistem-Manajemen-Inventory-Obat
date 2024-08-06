public class BulkOrderStrategy implements OrderStrategy {
    @Override
    public void order(String drugName, int quantity) {
        System.out.println("Bulk order placed for " + quantity + " units of " + drugName);
    }
}