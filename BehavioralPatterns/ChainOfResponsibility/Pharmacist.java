package chain;

public class Pharmacist extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("Number of pharmacist-approved drug purchase requests: " 
            + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
