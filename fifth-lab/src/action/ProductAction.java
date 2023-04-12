package action;

public interface ProductAction {
    public void setId(int id);
    public void setName(String name);
    public void setUPC(int UPC);
    public void setManufacturer(String manufacturer);
    public void setPrice(int price);
    public void setShelfLife(String shelfLife);
    public void setAmount(int amount);
    public int getId();
    public String getName();
    public int getUPC();
    public String getManufacturer();
    public int getPrice();
    public String getShelfLife();
    public int getAmount();
    public void moveToStorage();
    public void moveToShoppingRoom();
    public void buyProduct();
    public void removeProduct();
}
