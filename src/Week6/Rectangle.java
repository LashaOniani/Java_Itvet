package Week6;

public class Rectangle extends Shape{
    private double x;
    private double y;
    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double area(){
        return this.x * this.y;
    }
}
