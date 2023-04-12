package entity.toy;

public class AbstractToy {
    private String name;
    private int price;

    public AbstractToy(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setToy(AbstractToy toy) {
        this.name = toy.getName();
        this.price = toy.getPrice();
    }
}
