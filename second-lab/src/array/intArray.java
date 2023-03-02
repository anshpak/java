package array;

import java.io.FileInputStream;
import java.util.Scanner;

public class intArray {
    private int rows;
    private int cols;
    private final int[][] values = new int[rows][cols];

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getCols() {
        return cols;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public void setValues(FileInputStream valuesFileIn) {
        Scanner scanValues = new Scanner(valuesFileIn);
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getCols(); j++){
                this.values[i][j] = scanValues.nextInt();
            }
        }
    }

    public int[][] getValues(){
        return values;
    }
}
