package main;

import entity.Matrix;
import exception.MatrixException;
import creator.MatrixCreator;
import action.*;

public class Main {
    public static void main(String[] args) throws MatrixException {
        final int N = 5;
        final int M = 5;
        final int minValue = 0;
        final int maxValue = 2;
        Matrix boolMatrix1 = new Matrix(N, M);
        Matrix boolMatrix2 = new Matrix(N, M);
        MatrixCreator creator = new MatrixCreator();
        creator.fillRandomized(boolMatrix1, minValue, maxValue);
        creator.fillRandomized(boolMatrix2, minValue, maxValue);
        Logical logical = new Logical();
        Count count = new Count();
        Sort sort = new Sort();
        System.out.print("First one:");
        System.out.print(boolMatrix1);
        System.out.print("Second one:");
        System.out.print(boolMatrix2);
        System.out.print("OR:");
        Matrix resultMatrix;
        resultMatrix = logical.OR(boolMatrix1, boolMatrix2);
        System.out.print(resultMatrix);
        System.out.print("AND:");
        resultMatrix = logical.AND(boolMatrix1, boolMatrix2);
        System.out.print(resultMatrix);
        System.out.print("NOT:");
        resultMatrix = logical.NOT(resultMatrix);
        System.out.print(resultMatrix);
        System.out.print("Amount of ones: ");
        int onesAmount = count.getOnesAmount(resultMatrix);
        System.out.print(onesAmount);
        System.out.print("\nSorted: ");
        resultMatrix = sort.lexicographicalSort(resultMatrix);
        System.out.print(resultMatrix);
    }
}