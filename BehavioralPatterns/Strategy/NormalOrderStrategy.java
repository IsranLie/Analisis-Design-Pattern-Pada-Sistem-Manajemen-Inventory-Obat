public class NormalOrderStrategy implements OrderStrategy {
    @Override
    public void order(String drugName, int quantity) {
        System.out.println("Normal order placed for " + quantity + " units of " + drugName);
    }
}