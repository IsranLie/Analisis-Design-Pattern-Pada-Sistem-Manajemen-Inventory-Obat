package chain;

public interface Handler {
    void setNext(Handler nextHandler);
    void processRequest(PurchaseRequest request);
}

