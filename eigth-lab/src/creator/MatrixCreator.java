package creator;

import java.io.BufferedReader;
import java.io.IOException;

public class MatrixCreator {
    public static int[][] readFromFile(BufferedReader reader) throws IOException {
        reader.mark(1000);
        int n = MatrixCreator.getSize(reader);
        String line = "";
        int[][] matrix = new int[n][n];
        reader.reset();
        int i = 0;
        try {
            while ((line = reader.readLine()) != null) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.valueOf(line.split(" ")[j]);
                }
                i++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return matrix;
    }

    private static int getSize(BufferedReader reader) {
        int n = 0;
        String line = "";
        try {
            while (line != null && n == 0) {
                line = reader.readLine();
                n = line.split(" ").length;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
}
