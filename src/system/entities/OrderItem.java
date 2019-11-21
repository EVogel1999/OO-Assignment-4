package system.entities;

public class OrderItem {
    private String menuItemNum;

    public OrderItem() {
        menuItemNum = "";
    }

    public OrderItem(String menuItemNum) {
        this.menuItemNum = menuItemNum;
    }

    public String getMenuItemNum() {
        return menuItemNum;
    }

    public void setMenuItemNum(String menuItemNum) {
        this.menuItemNum = menuItemNum;
    }

    @Override
    public String toString() {
        return "Ordered Item Num: " + menuItemNum;
    }
}
