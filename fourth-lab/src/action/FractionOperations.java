package action;

import creator.FractionCreation;
import entity.Fraction;
import exception.FractionException;

public class FractionOperations {
    public Fraction multiply(Fraction fraction, int number) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction.getNumerator() * number);
        result.setDenominator(fraction.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction multiply(int number, Fraction fraction) throws FractionException {
        return multiply(fraction, number);
    }

    public Fraction multiply(Fraction fraction1, Fraction fraction2) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction divide(Fraction fraction, int number) throws FractionException {
        if(number == 0) {
            throw new FractionException("Division by zero.");
        }
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction.getNumerator());
        result.setDenominator(fraction.getDenominator() * number);
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction divide(int number, Fraction fraction) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction.getDenominator() * number);
        result.setDenominator(fraction.getNumerator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction divide(Fraction fraction1, Fraction fraction2) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        result.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction add(Fraction fraction, int number) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction.getNumerator() + number * fraction.getDenominator());
        result.setDenominator(fraction.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction add(int number, Fraction fraction) throws FractionException {
        return add(fraction, number);
    }

    public Fraction add(Fraction fraction1, Fraction fraction2) throws FractionException {
        Fraction result = new Fraction(1, 1);
        if(fraction1.getDenominator() == fraction2.getDenominator()) {
            result.setNumerator(fraction1.getNumerator() + fraction1.getNumerator());
            result.setDenominator(fraction1.getDenominator());
        } else {
            result.setNumerator(fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator());
            result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        }
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction subtract(Fraction fraction, int number) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction.getNumerator() - number * fraction.getDenominator());
        result.setDenominator(fraction.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction subtract(int number, Fraction fraction) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(number * fraction.getDenominator() - fraction.getNumerator());
        result.setDenominator(fraction.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }

    public Fraction subtract(Fraction fraction1, Fraction fraction2) throws FractionException {
        Fraction result = new Fraction(1, 1);
        if(fraction1.getDenominator() == fraction2.getDenominator()) {
            result.setNumerator(fraction1.getNumerator() - fraction1.getNumerator());
            result.setDenominator(fraction1.getDenominator());
        } else {
            result.setNumerator(fraction1.getNumerator() * fraction2.getDenominator() - fraction2.getNumerator() * fraction1.getDenominator());
            result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        }
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }
}
