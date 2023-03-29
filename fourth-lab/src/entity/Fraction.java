package entity;
import exception.FractionException;

import java.util.ArrayList;

public class Fraction extends Number{
    private int numerator;
    private int denomerator;
    public Fraction(int numerator, int denomerator) throws FractionException{
        if (checkDenomenator(denomerator)) {
            this.numerator = numerator;
            this.denomerator = denomerator;
        } else if (numerator == 0) {
            throw new FractionException("Pointless use of class.");
        } else {
            throw new FractionException("Division by zero.");
        }

    }

    private boolean checkDenomenator(int denomerator){
        if((denomerator == 0)) {
            return false;
        }
        return true;
    }

    private Fraction reduceFraction(int numerator, int denomerator) {
        ArrayList<Integer> numMultipliers = getMultipliers(numerator);
        ArrayList<Integer> denomMultipliers = getMultipliers(denomerator);
        for (int multiplier: numMultipliers) {
            if(denomMultipliers.contains(multiplier)) {
                numerator /= multiplier;
                denomerator /= multiplier;
                denomMultipliers.remove(multiplier);
            }
        }
        return null;
    }

    private ArrayList<Integer> getMultipliers(int number) {
        ArrayList<Integer> multipliers = new ArrayList<Integer>();
        while(number % 2 == 0) {
            multipliers.add(2);
            number = number / 2;
        }
        for(int i = 3; i * i <= number; i += 2) {
            if(number % i == 0) {
                multipliers.add(i);
                number = number / i;
                i = 3;
            }
        }
        multipliers.add(number);
        return multipliers;
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
