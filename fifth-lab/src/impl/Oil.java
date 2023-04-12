package impl;

import action.OilAction;

public class Oil extends Product implements OilAction {
    public Oil(int id, String name, int UPC, String manufacturer, int price, String shelfLife, int amount) {
        super(id, name, UPC, manufacturer, price, shelfLife, amount);
    }
}
