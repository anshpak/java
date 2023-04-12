package impl;

import action.ProductAction;

public class Product implements ProductAction {
    int id;
    String name;
    int UPC;
    String manufacturer;
    int price;
    String shelfLife;
    int amount;
    Location location;

    public Product(int id, String name, int UPC, String manufacturer, int price, String shelfLife, int amount){
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.amount = amount;
        this.location = Location.STORAGE;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUPC(int UPC) {
        this.UPC = UPC;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getUPC() {
        return UPC;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getShelfLife() {
        return shelfLife;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void moveToStorage() {
        if (location == Location.HALL) {
            location = Location.STORAGE;
        }
    }

    @Override
    public void moveToHall() {
        if (location == Location.STORAGE) {
            location = Location.HALL;
        }
    }

    @Override
    public String toString(){
        return "______________________________________________\n" +
                "Product: " + this.getName() + "\n From: " + getManufacturer() +
                "\nId: " + this.getId() + "\nUPC: " + this.getUPC() + "\nShelf life : till " + this.getShelfLife() +
                "\nAmount: " + this.getAmount() + "\nPrice per unit: " + this.getPrice() + " byn";
    }
}
