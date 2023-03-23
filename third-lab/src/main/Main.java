package main;
import entity.Matrix;
import exception.MatrixException;
import creator.MatrixCreator;

public class Main {
    public static void main(String[] args) throws MatrixException {
        final int N = 5;
        final int M = 5;
        final int minValue = 0;
        final int maxValue = 2;
        Matrix boolMatrix1 = new Matrix(N, M);
        MatrixCreator creator = new MatrixCreator();
        creator.fillRandomized(boolMatrix1, minValue, maxValue);
        System.out.print(boolMatrix1);
    }
}