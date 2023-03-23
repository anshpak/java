package action;

import entity.Matrix;
import exception.MatrixException;

public class Logical {
    public final Matrix OR(Matrix boolMatrix1, Matrix boolMatrix2) throws MatrixException {
        if (checkSizes(boolMatrix1, boolMatrix2)) {
            int v1 = boolMatrix1.getVerticalSize();
            int h1 = boolMatrix1.getHorizontalSize();
            Matrix resultMatrix = new Matrix(v1, h1);
            for(int i = 0; i < v1; i++) {
                for (int j = 0; j < h1; j++) {
                    if (boolMatrix1.getElement(i, j) + boolMatrix2.getElement(i, j) == 1 || boolMatrix1.getElement(i, j) + boolMatrix2.getElement(i, j) == 2) {
                        resultMatrix.setElement(i, j, 1);
                    } else {
                        resultMatrix.setElement(i, j, 0);
                    }
                }
            }
            return resultMatrix;
        } else {
            throw new MatrixException();
        }
    }

    public final Matrix AND(Matrix boolMatrix1, Matrix boolMatrix2) throws MatrixException {
        if (checkSizes(boolMatrix1, boolMatrix2)) {
            int v1 = boolMatrix1.getVerticalSize();
            int h1 = boolMatrix1.getHorizontalSize();
            Matrix resultMatrix = new Matrix(v1, h1);
            for(int i = 0; i < v1; i++) {
                for (int j = 0; j < h1; j++) {
                    if (boolMatrix1.getElement(i, j) * boolMatrix2.getElement(i, j) == 1) {
                        resultMatrix.setElement(i, j, 1);
                    } else {
                        resultMatrix.setElement(i, j, 0);
                    }
                }
            }
            return resultMatrix;
        } else {
            throw new MatrixException();
        }
    }

    public final Matrix NOT(Matrix boolMatrix) throws MatrixException {
        int v = boolMatrix.getVerticalSize();
        int h = boolMatrix.getHorizontalSize();
        Matrix resultMatrix = new Matrix(v, h);
        for(int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                if (boolMatrix.getElement(i, j) == 1) {
                    resultMatrix.setElement(i, j, 0);
                } else {
                    resultMatrix.setElement(i, j, 1);
                }
            }
        }
        return resultMatrix;
    }

    private boolean checkSizes(Matrix boolMatrix1, Matrix boolMatrix2) {
        int v1 = boolMatrix1.getVerticalSize();
        int h1 = boolMatrix1.getHorizontalSize();
        int v2 = boolMatrix2.getVerticalSize();
        int h2 = boolMatrix2.getHorizontalSize();
        return (v1 == v2 && h1 == h2);
    }
}
