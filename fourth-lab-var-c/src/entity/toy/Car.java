package entity.toy;

public class Car extends AbstractToy{
    private String model;
    public Car(String name, int price, String model) {
        super(name, price);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
