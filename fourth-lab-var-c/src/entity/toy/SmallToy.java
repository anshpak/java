package entity.toy;

public class SmallToy extends AbstractToy {
    private final Size size = Size.valueOf("Small".toUpperCase());

    public SmallToy (AbstractToy toy) {
        super(toy.getName(), toy.getPrice());
    }
}
