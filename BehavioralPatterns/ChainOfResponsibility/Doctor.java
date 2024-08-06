package chain;

public class Doctor extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 100) {
            System.out.println("Number of Doctor-approved drug purchase requests: " 
            + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}


