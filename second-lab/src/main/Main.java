package main;
import actions.ArrayProcessing;

public class Main {
    public static void main(String[] args) {
        /*int [][]testArr1 = {
                {2,3,2,6,2,4},
                {1,2,0,0,1,1},
                {2,6,2,3,2,7},
                {0,5,1,7,1,4}};*/
        int [][]testArr1 = {
                {2,3,5,2},
                {2,4,6,2},
                {-2,7,2,0}
        };
        ArrayProcessing action = new ArrayProcessing();
        int n = testArr1.length;
        int m = 4;
        int count = 0;
        for(int i = 0; i < n; i++){
            int minIndex = action.getMinIndex(testArr1[i]);
            for (int j = 0; j < m; j++){
                if(testArr1[i][j] == testArr1[i][minIndex]){
                    if(action.isSeddlePoint(testArr1, i, j)){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
    }
}