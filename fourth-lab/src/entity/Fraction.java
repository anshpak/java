package entity;

public class Fraction <T1 extends Number, T2 extends Number> extends Number{
    private T1 numerator;
    private T2 denomerator;

    public Fraction(T1 numerator, T2 denomerator){
        this.numerator = numerator;
        this.denomerator = denomerator;
    }

    public T1 getNumerator() {
        return numerator;
    }

    public T2 getDenomerator() {
        return denomerator;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
