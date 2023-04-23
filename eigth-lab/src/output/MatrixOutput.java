package output;

import java.io.BufferedWriter;
import java.io.IOException;

public class MatrixOutput {
    public static void writeToFile(int[][] matrix, BufferedWriter writer) throws IOException {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            String matrixLine = "";
            for (int j = 0; j < n; j++) {
                matrixLine += matrix[i][j];
                matrixLine += " ";
            }
            matrixLine += "\n";
            writer.write(matrixLine);
        }
    }
}
