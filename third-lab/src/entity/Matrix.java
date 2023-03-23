package entity;

import exception.MatrixException;

public class Matrix {
    private int[][] matrix;
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public Matrix(int n, int m) throws MatrixException {
        if (n < 1 || m < 1) {
            throw new MatrixException();
        }
        matrix = new int[n][m];
    }
    public int getVerticalSize() {
        return matrix.length;
    }
    public int getHorizontalSize() {
        return matrix[0].length;
    }
    private boolean checkRange(int i, int j) {
        return (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length);
    }
    public int getElement(int i, int j) throws MatrixException {
        if (checkRange(i, j)) {
            return matrix[i][j];
        } else {
            throw new MatrixException();
        }
    }
    public void setElement(int i, int j, int value) throws MatrixException {
        if (checkRange(i, j)) {
            matrix[i][j] = value;
        } else {
            throw new MatrixException();
        }
    }
    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("\nMatrix: " + matrix.length + "x" + matrix[0].length + "\n");
        for (int[] row: matrix) {
            for (int value: row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }
        return s.toString();
    }
}
