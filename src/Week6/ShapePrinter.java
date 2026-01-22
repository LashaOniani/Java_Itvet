package Week6;

public class ShapePrinter<T extends Shape> {
    private T shape;
    public ShapePrinter(T shape) {
        this.shape = shape;
    }
    public void print() {
        System.out.println("Area = " + shape.area());
    }
}
