package entity.toy;

public abstract class AbstractToy {
    private String name;
    private int price;
    public AbstractToy(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
