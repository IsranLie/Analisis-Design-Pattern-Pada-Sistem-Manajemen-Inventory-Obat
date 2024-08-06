package obs3;

public class LogisticsDepartment implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Logistics Department notified: " + message);
    }
}