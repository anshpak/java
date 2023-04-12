package entity.toy;

public class Doll extends AbstractToy{
    private Sex sex;

    public Doll(String name, int price, String sex) {
        super(name, price);
        this.sex = Sex.valueOf(sex.toUpperCase());
    }

    public Sex getSex() {
        return sex;
    }

    public enum Sex {
        MALE, FEMALE
    }
}
