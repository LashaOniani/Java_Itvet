package Week5;

public class ArraySum implements IArraySum {
    ArraySum(){}
    public int arraySum(int[] array){
        int tempSum = 0;
        for(int arr : array){
            tempSum += arr;
        }
        return tempSum;
    }
}
