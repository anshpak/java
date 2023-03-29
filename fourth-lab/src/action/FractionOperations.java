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

    public Fraction multiply(int num, Fraction fraction) throws FractionException {
        return multiply(fraction, num);
    }

    public Fraction multiply(Fraction fraction1, Fraction fraction2) throws FractionException {
        Fraction result = new Fraction(1, 1);
        result.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        result.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());
        FractionCreation creator = new FractionCreation();
        creator.reduceFractionCall(result);
        return result;
    }
}
