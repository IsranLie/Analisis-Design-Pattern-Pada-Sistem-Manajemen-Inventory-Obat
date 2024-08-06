package chain;

public abstract class Approver implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNext(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (nextHandler != null) {
            nextHandler.processRequest(request);
        }
    }
}
