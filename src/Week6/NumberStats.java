package Week6;

import java.util.ArrayList;
import java.util.List;

public class NumberStats <T extends Number & Comparable<T>>{

    private T[] array;

    public NumberStats(T[] list) {
        setArray(list);
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void findMax(){
        if(array.length > 0){
            T maxNum = array[0];
            for(T num : array){
                if(num.compareTo(maxNum)>0){
                    maxNum = num;
                }
            }
            System.out.println(maxNum);
        }
    }

    public void findMin(){
        if(array.length > 0){
            T minNum = array[0];
            for(T num : array){
                if(num.compareTo(minNum) < 0){
                    minNum = num;
                }
            }
            System.out.println(minNum);
        }
    }

    public void avg(){
        if(array.length > 0){
            double sum = 0;
            for(T num : array){
                sum += num.doubleValue();
            }
            System.out.println(sum / array.length);
        }
    }
}
