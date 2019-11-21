package system.commands;

import system.aggregators.Aggregator;
import system.aggregators.Menu;

public class CMDGetMenu implements Command{
    Aggregator aggregator;

    public CMDGetMenu(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    @Override
    public Object execute() {
        Menu menu = aggregator.getMenu();
        String[] result = new String[menu.getMenu().size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = menu.getMenuItem(i).toString();
        }
        return result;
    }
}
