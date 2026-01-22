package Week5;

import java.util.Arrays;

public class MaxElementExample {
    String findMaxWithIndex(int[] arr){
        int maxNumb = 0;
        for(int num : arr){
            maxNumb = num > maxNumb ? num : maxNumb;
        }
        return "The max number is: " + maxNumb + " and its index is: " + Arrays.asList(arr).indexOf(maxNumb);
    }
}
