package system.commands;

import system.aggregators.Aggregator;
import system.aggregators.Tab;

public class CMDGetTab implements Command{
    Aggregator aggregator;

    public CMDGetTab(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Object execute() {
        return new Tab(aggregator.getOrders(), aggregator.getMenu()).getTab();
    }
}
