package action;

import entity.Matrix;
import exception.MatrixException;
import java.util.*;

public class Sort {
    public final Matrix lexicographicalSort(Matrix boolMatrix) throws MatrixException {
        int v = boolMatrix.getVerticalSize();
        int h = boolMatrix.getHorizontalSize();
        String[] strings = new String[v];
        List<Integer> dcmls = new ArrayList<Integer>();
        Matrix resultMatrix = new Matrix(v, h);
        for(int i = 0; i < v; i ++) {
            strings[i] = "";
        }
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                strings[i] += String.valueOf(boolMatrix.getElement(i, j));
            }
        }
        for (int i = 0; i < v; i++) {
            dcmls.add(Integer.parseInt(strings[i], 2));
        }

        for (int i = 0; i < v; i++) {
            int max = Collections.max(dcmls);
            int k = dcmls.indexOf(max);
            for (int j = 0; j < h; j++) {
                resultMatrix.setElement(i, j, boolMatrix.getElement(k, j));
            }
            dcmls.remove(k);
        }
        return resultMatrix;
    }
}
