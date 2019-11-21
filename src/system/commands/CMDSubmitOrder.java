package system.commands;

import system.aggregators.Aggregator;
import system.entities.OrderItem;

public class CMDSubmitOrder implements Command{
    Aggregator aggregator;
    OrderItem item;

    public CMDSubmitOrder(Aggregator aggregator, OrderItem item) {
        this.aggregator = aggregator;
        this.item = item;
    }

    @Override
    public Object execute() {
        aggregator.getOrders().addOrderItem(item);
        return item.toString();
    }
}
