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
}
