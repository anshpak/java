package entity.toy;

public class Ball extends AbstractToy{
    private Type type;

    public Ball(String name, int price, String type) {
        super(name, price);
        this.type = Ball.Type.valueOf(type.toUpperCase());
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        FOOTBALL, VOLLEYBALL, BASKETBALL
    }
}
