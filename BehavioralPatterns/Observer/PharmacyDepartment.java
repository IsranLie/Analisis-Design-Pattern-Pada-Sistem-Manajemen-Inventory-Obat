package obs3;

public class PharmacyDepartment implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Pharmacy Department notified: " + message);
    }
}