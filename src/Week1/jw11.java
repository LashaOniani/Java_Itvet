package Week1;

import java.util.Scanner;

public class jw11 {
    public jw11(){
        // day 1 tasks
        // 1.1
        System.out.println("======");
        System.out.println("Task 1");
        System.out.println("======");
        int age = 25;
        System.out.println("My age is " + age);
        System.out.println("==============");
        System.out.println(" ");

        // 1.2
        System.out.println("======");
        System.out.println("Task 2");
        System.out.println("======");
        int a, b;
        a = 10;
        b = 20;
        System.out.println("The sum of a and b is: " + (a + b));
        System.out.println("==============");
        System.out.println(" ");

        // 1.3
        System.out.println("======");
        System.out.println("Task 3");
        System.out.println("======");
        String name = "Lasha";
        System.out.println("Hello, " + name);
        System.out.println("==============");
        System.out.println(" ");

        // 1.4
        System.out.println("======");
        System.out.println("Task 4");
        System.out.println("======");

        double celsius = 25;
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println(celsius + "celsius in fahrenheit is: " + fahrenheit);
        System.out.println("==============");
        System.out.println(" ");

        // 1.5
        System.out.println("======");
        System.out.println("Task 5");
        System.out.println("======");

        double a1, a2, a3;
        a1 = 30;
        a2 = 20;
        a3 = 10;
        double avg = (a1 + a2 + a3) / 3;
        System.out.println("The avg of numbers: 30, 20, 10 is: " + avg);
        System.out.println("==============");
        System.out.println(" ");

        // 1.6
        System.out.println("======");
        System.out.println("Task 6");
        System.out.println("======");

        int s1, s2, s3;
        s1 = 30;
        s2 = 20;
        s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("(30, 20)" + "( "+s1 +", " + s2 + " )");
        System.out.println("==============");
        System.out.println(" ");

        // 1.7
        System.out.println("======");
        System.out.println("Task 7");
        System.out.println("======");

        double radius = 7;
        double area = Math.PI * radius * radius;
        System.out.println("The area of radius " + radius + " is: " + area);
        System.out.println("==============");
        System.out.println(" ");

        // 1.8
        System.out.println("======");
        System.out.println("Task 8");
        System.out.println("======");

        int a8 = 123;
        int a8_1, a8_2, a8_3;
        a8_1 = a8 / 100;
        a8_2 = (a8 / 10) % 10;
        a8_3 = a8 % 10;
        int a8_avg = (a8_1 + a8_2 + a8_3) / 3;
        System.out.println("Task 8 avg is: " + a8_avg);
        System.out.println("==============");
        System.out.println(" ");

        // 1.9
        System.out.println("======");
        System.out.println("Task 9");
        System.out.println("======");

        Scanner sc = new Scanner(System.in);
        int width, length;
        System.out.print("Enter the width of a number: ");
        width = sc.nextInt();
        System.out.print("Enter the length of a number: ");
        length = sc.nextInt();
        System.out.print("The Perimeter is: " + (2 *(width + length)));
        System.out.print("The Area is: " + (width * length));

        // 1.10
        System.out.println("======");
        System.out.println("Task 10");
        System.out.println("======");

        int seconds, minutes;
        System.out.print("Enter the seconds you want to convert: ");
        seconds = sc.nextInt();
        minutes = seconds / 60;
        System.out.print(seconds + " seconds is " + minutes + " minutes and " + (seconds % 60) + " seconds");

        sc.close();
    }
}
