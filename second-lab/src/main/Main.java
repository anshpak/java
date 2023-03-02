package main;
import actions.ArrayProcessing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import array.intArray;

public class Main {
    public static void main(String[] args) throws IOException{
        /*int [][]testArr1 = {
                {2,3,2,6,2,4},
                {1,2,0,0,1,1},
                {2,6,2,3,2,7},
                {0,5,1,7,1,4}};*/

        ArrayProcessing action = new ArrayProcessing();

        FileInputStream sizeFileIn = new FileInputStream("src/files/sizes.txt");

        Scanner scanSizes = new Scanner(sizeFileIn);
        int n = scanSizes.nextInt();
        int m = scanSizes.nextInt();
        sizeFileIn.close();

        int myArr[][] = new int[n][m];

        FileInputStream valuesFileIn = new FileInputStream("src/files/values.txt");

        Scanner scanValues = new Scanner(valuesFileIn);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                myArr[i][j] = scanValues.nextInt();
            }
        }
        valuesFileIn.close();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(myArr[i][j] + "  ");
            }
            System.out.println();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            int minIndex = action.getMinIndex(myArr[i]);
            for (int j = 0; j < m; j++){
                if(myArr[i][j] == myArr[i][minIndex]){
                    if(action.isSeddlePoint(myArr, i, j)){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}