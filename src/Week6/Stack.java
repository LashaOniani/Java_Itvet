package Week6;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T element){
        elements.add(element);
    }
    public T pop(){
        T element = elements.getLast();
        elements.removeLast();
        return element;
    }
    public T Peek(){
        if(!elements.isEmpty()){
            return elements.getLast();
        }else{
            return null;
        }
    }
}
