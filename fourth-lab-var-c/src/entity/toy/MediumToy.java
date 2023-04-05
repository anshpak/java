package entity.toy;

public class MediumToy extends AbstractToy {
    private final Size size = Size.valueOf("Medium".toUpperCase());

    public MediumToy (AbstractToy toy) {
        super(toy.getName(), toy.getPrice());
    }
}
