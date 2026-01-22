import Week1.jw11;
import Week1.jw12;
import Week2.jw21;
import Week4.jw4;
import Week5.jw5;
import Week6.jw6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("There are Tasks you can Load");
        System.out.println("=============================");
        System.out.println("you should choose and input task name examples:");
        System.out.println("j-w-1-1, j-w-1-2, j-w-2-1, j-w-4-final, j-w-5");
        System.out.println("===============================================");

        System.out.print("please insert task name example: ");
        Scanner input = new Scanner(System.in);
        String inputTxt = input.nextLine();

        if (inputTxt.equals("j-w-1-1")) {
            jw11 jw11 = new jw11();
        }else if (inputTxt.equals("j-w-1-2")) {
            jw12 jw12 = new jw12();
        }else if (inputTxt.equals("j-w-2-1")) {
            jw21 jw21 = new jw21();
        }else if(inputTxt.equals("j-w-4-final")){
            System.out.println("Please input which task you want to load: T1 or T2: ");
            String taskToLoad = input.nextLine();
            jw4 jw4 = new jw4(taskToLoad);
        }else if (inputTxt.equals("j-w-5")) {
            jw5 jw5 = new jw5();
        }else if (inputTxt.equals("jw6")) {
            jw6 jw6 = new jw6();
        }
    }
}