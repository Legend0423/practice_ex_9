public class Main {
    public static void main(String[] args) {
        HandleOrders handleOrders = new HandleOrders();
        handleOrders.takeOrder();
        handleOrders.createOrderSummary();
        System.out.println(handleOrders);

        handleOrders.displayCustomPizzas();

        OrderLogs orderLogs = new OrderLogs();
        orderLogs.addOrderLog("Order 1 placed");
        orderLogs.addOrderLog("Order 2 placed");
        orderLogs.handleLogs();

        PizzaOrderQueue pizzaOrderQueue = new PizzaOrderQueue();
        pizzaOrderQueue.addOrder("Pepperoni Pizza");
        pizzaOrderQueue.addOrder("Veggie Pizza");
        pizzaOrderQueue.displayOrders();
        pizzaOrderQueue.processNextOrder();
        pizzaOrderQueue.displayOrders();
    }
}