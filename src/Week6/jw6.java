package Week6;

public class jw6 {
    public jw6(){
        System.out.println("== T1 ==");
        Box<Integer> intBox = new Box<>(123);
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        intBox.printType();
        stringBox.printType();

        System.out.println("== T2 ==");
        Pair<Integer, String> student = new Pair<>(1, "Giorgi");
        Pair<String, Double> product = new Pair<>("Price", 19.99);

        System.out.println(student.toString());
        System.out.println(product.toString());


        System.out.println("== T3 ==");
        Stack<Integer> intStack = new Stack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println(intStack.Peek()); // 20
        System.out.println(intStack.pop());  // 20
        System.out.println(intStack.pop());  // 10

        Stack<String> strStack = new Stack<>();
        strStack.push("A");
        strStack.push("B");
        System.out.println(strStack.pop());

        System.out.println("== T4 ==");
        ShapePrinter<Circle> circle = new ShapePrinter<>(new Circle(5.0));
        ShapePrinter<Rectangle> rectangle = new ShapePrinter<>(new Rectangle(4, 6));

        circle.print();
        rectangle.print();

        System.out.println("== T5 ==");

        Integer[] intArr = {5, 2, 9, 1, 7};
        NumberStats<Integer> intStats = new NumberStats<>(intArr);
        intStats.findMax();
        intStats.findMin();
        intStats.avg();


        Double[] dblArr = {2.5, 3.7, 1.2, 9.8};
        NumberStats<Double> dblStats = new NumberStats<>(dblArr);
        dblStats.findMax();
        dblStats.findMin();
        dblStats.avg();
    }
}
