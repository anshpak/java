package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
        }
        int[][] trMatrix = new int[n][n];
        for (i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trMatrix[j][i] = matrix[i][j];
            }
        }
    }
}