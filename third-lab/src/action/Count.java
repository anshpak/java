package action;

import entity.Matrix;
import exception.MatrixException;

public class Count {
    public final int getOnesAmount(Matrix boolMatrix) throws MatrixException {
        int result = 0;
        int v = boolMatrix.getVerticalSize();
        int h = boolMatrix.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                if (boolMatrix.getElement(i, j) == 1) {
                    result++;
                }
            }
        }
        return result;
    }
}
