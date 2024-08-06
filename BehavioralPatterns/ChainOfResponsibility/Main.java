package chain;

public class Main {
    public static void main(String[] args) {
        // Buat Handler
        Handler doctor = new Doctor();
        Handler pharmacist = new Pharmacist();
        Handler manager = new Manager();

        // chain of responsibility
        doctor.setNext(pharmacist);
        pharmacist.setNext(manager);

        // request pembelian
        PurchaseRequest request1 = new PurchaseRequest(75);
        PurchaseRequest request2 = new PurchaseRequest(150);
        PurchaseRequest request3 = new PurchaseRequest(250);

        // proses request
        doctor.processRequest(request1);
        doctor.processRequest(request2);
        doctor.processRequest(request3);
    }
}
