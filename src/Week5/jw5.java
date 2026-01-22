package Week5;

public class jw5 {
    int[] scores = {5, 10, 15, 20};
    int[] randomNumbers = {7, 1, 15, 3, 2};
    public jw5(){
        ArraySum arraySumExample = new ArraySum();
        System.out.println(arraySumExample.arraySum(scores));
        MaxElementExample arrayMaxIndex = new MaxElementExample();
        System.out.println(arrayMaxIndex.findMaxWithIndex(randomNumbers));
    }
}