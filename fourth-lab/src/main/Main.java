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
        Fraction fraction4 = new Fraction(2, 120);
        Fraction fraction5 = new Fraction(1, 12);
        Fraction fraction6 = new Fraction(7, 120);
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
        System.out.print("\n\nAddition fraction by number:\n" + fraction4 + " + " + num1 + " = " + operations.add(fraction4, num1));
        System.out.print("\n\nAddition number by fraction:\n" + num2 + " + " + fraction5 + " = " + operations.add(num2, fraction5));
        System.out.print("\n\nAddition fraction by fraction:\n" + fraction5 + " + " + fraction2 + " = " + operations.add(fraction5, fraction2));
        System.out.print("\n\nSubtraction fraction by number:\n" + fraction6 + " - " + num3 + " = " + operations.subtract(fraction6, num3));
        System.out.print("\n\nSubtraction number by fraction:\n" + num1 + " - " + fraction1 + " = " + operations.subtract(num1, fraction1));
        System.out.print("\n\nSubtraction fraction by fraction:\n" + fraction6 + " - " + fraction4 + " = " + operations.subtract(fraction6, fraction4));
    }
}