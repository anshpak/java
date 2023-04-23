package main;

import action.MatrixAction;
import creator.MatrixCreator;
import output.MatrixOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/files/data.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        int[][] matrix = null;

        try {
            matrix = MatrixCreator.readFromFile(reader);
            reader.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        int[][] trMatrix = MatrixAction.transpose(matrix);
        String outputFileName = "src/files/res.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, false));
            writer.write("Initial matrix:\n");
            MatrixOutput.writeToFile(matrix, writer);
            writer.write("Transposed matrix:\n");
            MatrixOutput.writeToFile(trMatrix, writer);
            writer.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }
}