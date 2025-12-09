import Week1.jw11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("There are Tasks you can Load");
        System.out.println("=============================");
        System.out.println("you should choose and input task name examples:");
        System.out.println("j-w-1-1, j-w-1-2, j-w-1-3");
        System.out.println("===============================================");

        System.out.print("please insert task name example: ");
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();

        if (inputTxt.equals("j-w-1-1")) {
            jw11 age = new jw11();
        }
    }
}