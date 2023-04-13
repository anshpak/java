package impl;

public class CottageCheese extends Product implements action.CottageCheeseAction {
    public CottageCheese(int id, String name, int UPC, String manufacturer, float price, String shelfLife, int amount) {
        super(id, name, UPC, manufacturer, price, shelfLife, amount);
    }
}
