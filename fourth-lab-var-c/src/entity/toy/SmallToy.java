package entity.toy;

public class SmallToy <K extends AbstractToy> {
    private final Size size = Size.valueOf("Small".toUpperCase());
}
