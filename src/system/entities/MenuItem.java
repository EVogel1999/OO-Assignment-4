package system.entities;

public class MenuItem {
    private String itemNum;
    private String description;
    private double cost;

    public MenuItem() {
        itemNum = "";
        description = "";
        cost = 0;
    }

    public MenuItem(String itemNum, String description, double cost) {
        this.itemNum = itemNum;
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getItemNum() {
        return itemNum;
    }

    public void setItemNum(String itemNum) {
        this.itemNum = itemNum;
    }

    @Override
    public String toString() {
        return "[" + itemNum + "] " + description + " - $" + cost;
    }
}
