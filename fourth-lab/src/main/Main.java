package main;

import action.FractionOperations;
import entity.Fraction;
import exception.FractionException;

public class Main {
    public static void main(String[] args) throws FractionException {
        int n = 1;
        int m = 3;
        // Division by zero example
        // Fraction errorFrac = new Fraction(1, 0);
        // Pointless use of the class example
        //Fraction errorFrac = new Fraction(0, 0);
        Fraction fraction1 = new Fraction(156384, 1242648);
        Fraction fraction2 = new Fraction(11, 57);
        Fraction fraction3 = new Fraction(2, 523);
        int num1 = 523;
        int num2 = 11;
        int num3 = 2;
        FractionOperations operations = new FractionOperations();

        System.out.print("Fraction 1:\n");
        System.out.print(fraction1);
        System.out.print("\n\nMultiplication fraction by number:\n" + fraction1 + " * " + num1 + " = " + operations.multiply(fraction1, num1));
        System.out.print("\n\nMultiplication number by fraction:\n" + num2 + " * " + fraction1 + " = " + operations.multiply(num2, fraction1));
        System.out.print("\n\nMultiplication fraction by fraction:\n" + fraction1 + " * " + fraction2 + " = " + operations.multiply(fraction1, fraction2));
        System.out.print("\n\nDivision fraction by number:\n" + fraction1 + " / " + num3 + " = " + operations.divide(fraction1, num3));
        System.out.print("\n\nDivision number by fraction:\n" + num3 + " / " + fraction1 + " = " + operations.divide(num1, fraction1));
        System.out.print("\n\nDivision fraction by fraction:\n" + fraction1 + " / " + fraction3 + " = " + operations.divide(fraction1, fraction3));
        // Division by zero example
        // operations.divide(fraction1, 0);
    }
}