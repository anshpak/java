package entity;
import exception.FractionException;

public class Fraction extends Number{
    private int numerator;
    private int denomerator;
    public Fraction(int numerator, int denomerator) throws FractionException{
        if (checkDenomenator(denomerator)) {
            this.numerator = numerator;
            this.denomerator = denomerator;
        }

    }

    private boolean checkDenomenator(int denomerator){
        if((denomerator == 0)) {
            return false;
        }
        return true;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenomerator() {
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
