package entity.toy;

public class BigToy <K extends AbstractToy> {
    private final Size size = Size.valueOf("Big".toUpperCase());

    K toy;
    public BigToy (K toy) {
        this.toy = toy;
    }
}
