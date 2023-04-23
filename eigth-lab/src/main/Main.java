package main;

import action.MatrixAction;
import creator.MatrixCreator;
import output.MatrixOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/files/data.txt";
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        int[][] matrix = MatrixCreator.readFromFile(reader);
        reader.close();

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