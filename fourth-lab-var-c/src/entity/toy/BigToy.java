package entity.toy;

public class BigToy extends AbstractToy {
    private final Size size = Size.valueOf("Big".toUpperCase());

    public BigToy (AbstractToy toy) {
        super(toy.getName(), toy.getPrice());
    }
}
