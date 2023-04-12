package impl;

import action.MilkAction;

public class Milk extends Product implements MilkAction {
    private int size;
    private int fatPercentage;

    public Milk(int id, String name, int UPC, String manufacturer, int price, String shelfLife, int amount, int size, int fatPercentage) {
        super(id, name, UPC, manufacturer, price, shelfLife, amount);
    }

    public int getSize(){
        return size;
    }

    public int getFatPercentage(){
        return fatPercentage;
    }

    @Override
    public String toString(){
        return "______________________________________________\n" +
                "Product: " + this.getName() + "\nType: " + this.getClass() + "\nSize: " + this.getSize() + " liters" +
                "\nFat Percentage " + this.getFatPercentage() + " %" + "\n From: " + getManufacturer() +
                "\nId: " + this.getId() + "\nUPC: " + this.getUPC() + "\nShelf life : till " + this.getShelfLife() +
                "\nAmount: " + this.getAmount() + "\nPrice per unit: " + this.getPrice() + "byn";
    }
}
