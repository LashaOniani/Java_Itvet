package Week2;

import java.util.Scanner;

public class jw21 {
    public jw21(){
        Scanner sc = new Scanner(System.in);


        // day 1 tasks - loops and switch
        System.out.println(" ");
        System.out.println(" Week two first Tasks ");
        // 1.1
        System.out.println("======");
        System.out.println("Task 1");
        System.out.println("======");
        for(int i = 1; i <= 10; i++){
            System.out.print(i == 10 ? i + ";" : i + ", ");
        }
        System.out.println("==============");
        System.out.println(" ");

        // 1.2
        System.out.println("======");
        System.out.println("Task 2");
        System.out.println("======");
        int sum = 0;
        for(int i = 1; i <= 5; i ++) sum += i;
        System.out.println("the sum from 1 to 5 is: " + sum);
        System.out.println("==============");
        System.out.println(" ");

        // 1.3
        System.out.println("======");
        System.out.println("Task 3");
        System.out.println("======");
        System.out.print("whileLoopCounter: ");
        int whileLoopCounter = 0;
        while(whileLoopCounter < 5){
            whileLoopCounter++;
            System.out.print(" " + whileLoopCounter);
        }
        System.out.println(" ");
        System.out.println("==============");
        System.out.println(" ");


        // 1.4
        System.out.println("======");
        System.out.println("Task 4");
        System.out.println("======");
        int startbalance = 20;
        int balance = startbalance;
        while(balance < 40){
            balance+=5;
        }
        System.out.println("The start balance is " + startbalance + " and the balance is " + balance);
        System.out.println("==============");
        System.out.println(" ");

        // 1.5
        System.out.println("======");
        System.out.println("Task 5");
        System.out.println("======");

        System.out.println("Insert month number: ");
        int monthNum = sc.nextInt();

        switch(monthNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println("==============");
        System.out.println(" ");


        //1.6
        System.out.println("======");
        System.out.println("Task 6");
        System.out.println("======");

        System.out.println("Please enter any number and press Enter");
        int divNum = sc.nextInt();
        int kindNumber = 0;
        boolean loopLoad = true;
        System.out.println("Those numbers can divide your number without remainder");
        while(loopLoad){
            kindNumber++;
            if(divNum % kindNumber == 0 && kindNumber <= divNum){
                System.out.print(kindNumber == divNum ? kindNumber : kindNumber + ", ");
            } else if (divNum % kindNumber != 0 && kindNumber < divNum) {
                // break;
            }else{
                loopLoad = false;
            }
        }
        System.out.println(" ");
        System.out.println("==============");
        System.out.println(" ");

        //1.7
        System.out.println("======");
        System.out.println("Task 7 - easy calculator");
        System.out.println("======");

        int numb = 0;

        System.out.println("Please enter any number and press Enter");
        int calculatorFirstNumber = sc.nextInt();
        System.out.println("Please enter any operation: +, -, /, *");
        String operation = sc.next();
        System.out.println("Please enter any number and press Enter");
        int calculatorSecondNumber = sc.nextInt();

        switch(operation){
            case "+":
                numb = calculatorFirstNumber + calculatorSecondNumber;
                break;
            case "-":
                numb = calculatorFirstNumber - calculatorSecondNumber;
                break;
            case "*":
                numb = calculatorFirstNumber * calculatorSecondNumber;
                break;
            case "/":
                numb = calculatorFirstNumber / calculatorSecondNumber;
                break;
        }
        System.out.println("After too many calculations your number is: " + numb);
        System.out.println("==============");
        System.out.println(" ");
        sc.close();

    }
}
