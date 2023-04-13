package impl;

import action.MilkAction;

public class Milk extends Product implements MilkAction {
    private int size;
    private float fatPercentage;

    public Milk(int id, String name, int UPC, String manufacturer, float price, String shelfLife, int amount, int size, float fatPercentage) {
        super(id, name, UPC, manufacturer, price, shelfLife, amount);
        this.size = size;
        this.fatPercentage = fatPercentage;
    }

    public int getSize(){
        return size;
    }

    public float getFatPercentage(){
        return fatPercentage;
    }

    @Override
    public String toString(){
        return "\n______________________________________________\n" +
                "Product: " + this.getName() + "\nType: " + this.getClass() + "\nSize in liters: " + this.getSize() +
                "\nFat Percentage " + this.getFatPercentage() + " %" + "\nFrom: " + getManufacturer() +
                "\nId: " + this.getId() + "\nUPC: " + this.getUPC() + "\nShelf life : till " + this.getShelfLife() +
                "\nAmount: " + this.getAmount() + "\nPrice per unit: " + this.getPrice() + " byn" + "\nLocation:" + this.getLocation();
    }
}
