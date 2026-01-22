package Week6;

public class Box<T> {
    private T value;
    public Box() {}
    public Box(T value) {
        setValue(value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printType() {
        if(value == null){
            System.out.println("null");
        }else{
            System.out.println(value.getClass().getName());
        }
    }

    public String toString() {
        return value.toString();
    }
}
