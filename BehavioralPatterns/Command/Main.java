public class Main {
    public static void main(String[] args) {
        CommandInvoker invoker = new CommandInvoker();

        Command orderCommand = new OrderDrugCommand("Aspirin", 50);
        invoker.setCommand(orderCommand);
        invoker.executeCommand();

        Command cancelCommand = new CancelOrderCommand(12345);
        invoker.setCommand(cancelCommand);
        invoker.executeCommand();

        Command updateCommand = new UpdateInventoryCommand("Ibuprofen", 100);
        invoker.setCommand(updateCommand);
        invoker.executeCommand();
    }
}