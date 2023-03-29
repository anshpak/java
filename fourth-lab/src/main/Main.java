package main;
import entity.Fraction;
import exception.FractionException;
import entity.Fraction;

public class Main {
    public static void main(String[] args) throws FractionException {
        int n = 1;
        int m = 3;
        // Division by zero example
        // Fraction errorFrac = new Fraction(1, 0);
        // Pointless use of the class example
        //Fraction errorFrac = new Fraction(0, 0);
        Fraction fraction = new Fraction(156384, 1242648);
        System.out.print(fraction);
    }
}