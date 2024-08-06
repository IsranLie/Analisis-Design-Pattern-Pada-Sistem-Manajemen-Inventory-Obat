public class OrderContext {
    private OrderStrategy orderStrategy;

    public void setOrderStrategy(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public void executeOrder(String drugName, int quantity) {
        orderStrategy.order(drugName, quantity);
    }
}