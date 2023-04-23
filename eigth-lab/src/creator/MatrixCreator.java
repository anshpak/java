package creator;

import exception.MatrixException;

import java.io.BufferedReader;
import java.io.IOException;

public class MatrixCreator {
    public static int[][] readFromFile(BufferedReader reader) {
        try {
            reader.mark(1000);
        } catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        int n = MatrixCreator.getSize(reader);
        try {
            if (n == 0) {
                throw new MatrixException("Empty file.");
            }
        } catch (MatrixException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        MatrixCreator.checkMatrix(reader, n);

        String line = "";
        int[][] matrix = new int[n][n];

        try {
            reader.reset();
        } catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        int i = 0;

        try {
            while ((line = reader.readLine()) != null) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
                i++;
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        return matrix;
    }

    private static int getSize(BufferedReader reader) {
        int n = 0;
        String line = "";

        try {
            line = reader.readLine();
            n = line.split(" ").length;
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        return n;
    }

    private static void checkMatrix(BufferedReader reader, int n) {
        String line = "";
        int count = 1;
        try {
            while ((line = reader.readLine()) != null) {
                if (n != line.split(" ").length) {
                    throw new MatrixException("Different size of matrix rows.");
                }
                count++;
            }
            if (count != n) {
                throw new MatrixException("Not enough rows.");
            }
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        } catch (MatrixException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }

}
