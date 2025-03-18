import java.util.LinkedList;
import java.util.Queue;

public class PizzaOrderQueue {
    private Queue<String> pizzaOrders;

    public PizzaOrderQueue() {
        pizzaOrders = new LinkedList<>();
    }

    public void addOrder(String order) {
        pizzaOrders.add(order);
    }

    public void displayOrders() {
        if (!pizzaOrders.isEmpty()) {
            System.out.println("Pizza orders in queue:");
            for (String order : pizzaOrders) {
                System.out.println(order);
            }
        } else {
            System.out.println("The order queue is empty.");
        }
    }

    public void processNextOrder() {
        if (!pizzaOrders.isEmpty()) {
            System.out.println("Processing next order: " + pizzaOrders.poll());
        } else {
            System.out.println("No orders in the queue.");
        }
    }
}