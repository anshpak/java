package entity.toy;

public class MediumToy <K extends AbstractToy> {
    private final Size size = Size.valueOf("Medium".toUpperCase());
    K toy;
    public MediumToy (K toy) {
        this.toy = toy;
    }
}
