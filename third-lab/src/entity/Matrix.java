package entity;
import exception.MatrixException;

public class Matrix<T extends Number> {
    private T[][] matrix;
    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }
    public Matrix(int n, int m) throws MatrixException {
        if(n < 1 || m < 1) {
            throw new MatrixException();
        }
        matrix = new T[n][m];
    }
}
