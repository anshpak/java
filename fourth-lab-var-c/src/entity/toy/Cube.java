package entity.toy;

public class Cube extends AbstractToy{
    private String color;

    public Cube(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
}
