package entity.toy;

public class SmallToy extends Doll {
    private final Size size = Size.valueOf("Small".toUpperCase());

    public SmallToy(String name, int price, String sex) {
        super(name, price, sex);
    }

    public Size getSize() {
        return size;
    }
}
