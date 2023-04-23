package main;

import action.MatrixAction;
import output.MatrixOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/files/data.txt";
        int n = 0;
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        try {
            while (line != null && n == 0) {
                line = reader.readLine();
                n = line.split(" ").length;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int[][] matrix = new int[n][n];
        for (int i = 0, j = 0; j < n; j++) {
            matrix[i][j] = Integer.valueOf(line.split(" ")[j]);
        }
        int i = 1;
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
            reader.close();
        }
        finally {
            reader.close();
        }

        int[][] trMatrix = MatrixAction.transpose(matrix);

        String outputFileName = "src/files/res.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, false));
        writer.write("Initial matrix:\n");
        MatrixOutput.writeToFile(matrix, writer);
        writer.write("Transposed matrix:\n");
        MatrixOutput.writeToFile(trMatrix, writer);
        writer.close();
    }
}