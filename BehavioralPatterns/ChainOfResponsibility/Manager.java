package chain;

public class Manager extends Approver {
    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() > 500) {
            System.out.println("Number of drug purchase requests approved by the Manager: " 
            + request.getAmount());
        } else if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}

