package actions;

public class ArrayProcessing {
    public int getMinIndex(int[] vector){
        int n = vector.length;
        int minIndex = 0;
        for(int i = 1; i < n; i++){
            if(vector[i] < vector[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }

    public boolean isSeddlePoint(int[][] array, int rowIndex, int colIndex){
        int n = array.length;
        int maxTmpIndex = 0;
        for(int i = 0; i < n; i++){
            if(array[i][colIndex] > array[maxTmpIndex][colIndex]){
                maxTmpIndex = i;
            }
        }
        return array[maxTmpIndex][colIndex] == array[rowIndex][colIndex];
    }
}
