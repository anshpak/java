package entity;
import exception.MatrixException;

public class Matrix {
    private int[][] matrix;
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public Matrix(int n, int m) throws MatrixException {
        if(n < 1 || m < 1) {
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
    
}
