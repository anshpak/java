package action;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixAction {
    public static int[][] transpose(int[][] matrix){
        int n = matrix.length;
        int[][] trMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trMatrix[j][i] = matrix[i][j];
            }
        }
        return trMatrix;
    }
}
