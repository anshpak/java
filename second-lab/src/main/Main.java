package main;
import actions.ArrayProcessing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import array.intArray;

public class Main {
    public static void main(String[] args) throws IOException{

        ArrayProcessing action = new ArrayProcessing();

        FileInputStream sizeFileIn = new FileInputStream("src/files/sizes.txt");

        intArray myArr = new intArray();

        Scanner scanSizes = new Scanner(sizeFileIn);
        myArr.setRows(scanSizes.nextInt());
        myArr.setCols(scanSizes.nextInt());
        sizeFileIn.close();

        FileInputStream valuesFileIn = new FileInputStream("src/files/values.txt");
        myArr.setValues(valuesFileIn);
        valuesFileIn.close();

        for(int i = 0; i < myArr.getRows(); i++){
            for(int j = 0; j < myArr.getCols(); j++){
                System.out.print(myArr.getValues()[i][j] + "  ");
            }
            System.out.println();
        }

        int count = 0;
        for(int i = 0; i < myArr.getRows(); i++){
            int minIndex = action.getMinIndex(myArr.getValues()[i]);
            for (int j = 0; j < myArr.getCols(); j++){
                if(myArr.getValues()[i][j] == myArr.getValues()[i][minIndex]){
                    if(action.isSeddlePoint(myArr.getValues(), i, j)){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}