package system.aggregators;

import system.entities.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<OrderItem> orders;

    public Orders() {
        orders = new ArrayList<>();
    }

    public Orders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderItem> orders) {
        this.orders = orders;
    }

    public OrderItem getOrderItem(int i) {
        return orders.get(i);
    }

    public void removeOrderItem(int i) {
        orders.remove(i);
    }

    public void removeOrderItem(Object item) {
        orders.remove(item);
    }

    public void addOrderItem(OrderItem item) {
        orders.add(item);
    }
}
