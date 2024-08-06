public class EmergencyOrderStrategy implements OrderStrategy {
    @Override
    public void order(String drugName, int quantity) {
        System.out.println("Emergency order placed for " + quantity + " units of " + drugName);
    }
}