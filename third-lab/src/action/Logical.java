package action;
import entity.Matrix;
import exception.MatrixException;

public class Logical {
    public final Matrix OR(Matrix boolMatrix1, Matrix boolMatrix2) throws MatrixException {
        int v1 = boolMatrix1.getVerticalSize();
        int h1 = boolMatrix1.getHorizontalSize();
        int v2 = boolMatrix2.getVerticalSize();
        int h2 = boolMatrix2.getHorizontalSize();
        if (checkSizes(v1, h1, v2, h2)) {
            Matrix resultMatrix = new Matrix(v1, h1);
            for(int i = 0; i < v1; i++) {
                for (int j = 0; j < h1; j++) {
                    if (boolMatrix1.getElement(i, j) + boolMatrix2.getElement(i, j) == 1) {
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

    private boolean checkSizes(int v1, int h1, int v2, int h2) {
        return (v1 == v2 && h1 == h2);
    }
}
