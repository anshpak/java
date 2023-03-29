package entity;

import exception.FractionException;
import creator.FractionCreation;

public class Fraction extends Number{
    private int numerator;
    private int denominator;
    public Fraction(int numerator, int denominator) throws FractionException{
        if (checkDenominator(denominator)) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else if (numerator == 0) {
            throw new FractionException("Pointless use of class.");
        } else {
            throw new FractionException("Division by zero.");
        }
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(this);
    }

    private boolean checkDenominator(int denominator){
        if((denominator == 0)) {
            return false;
        }
        return true;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
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

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\n" + numerator + "\n---\n" + denominator + "\n");
        return s.toString();
    }
}
