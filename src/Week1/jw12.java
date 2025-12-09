package Week1;

public class jw12 {
    public jw12(){
        // day 5 tasks - strings
        System.out.println(" ");
        System.out.println(" Week one Second Tasks ");

        // 1.1
        System.out.println("======");
        System.out.println("Task 1");
        System.out.println("======");
        String text = "Java First String Task";
        System.out.println("The Length of the String: `" + text + "` is: " + text.length());
        System.out.println("==============");
        System.out.println(" ");

        //1.2
        System.out.println("======");
        System.out.println("Task 2");
        System.out.println("======");
        String text_2 = "Java Programming";
        System.out.println(text_2 + "To UpperCase looks: " + text.toUpperCase());
        System.out.println(text_2 + "To LowerCase looks: " + text.toLowerCase());
        System.out.println("==============");
        System.out.println(" ");

        //1.3
        System.out.println("======");
        System.out.println("Task 3");
        System.out.println("======");
        String text_3 = "Translate";
        System.out.println("Get fist and last character from the '" + text_3 + "': " + text_3.charAt(0) + " amd " + text_3.charAt(text_3.length()-1));
        System.out.println("==============");
        System.out.println(" ");

        //1.4
        System.out.println("======");
        System.out.println("Task 4");
        System.out.println("======");
        String text_4 = "Programming is fun!";
        System.out.println("Get first five characters from the '" + text_4 + "': " + text_4.substring(0, 4));
        System.out.println("==============");
        System.out.println(" ");

        //1.5
        System.out.println("======");
        System.out.println("Task 5");
        System.out.println("======");
        String text_5 = "i am learning Java Programming";
        System.out.println(text_5.contains("Java") ? "text contains Java" : "text does not contain Java");
        System.out.println("==============");
        System.out.println(" ");

        //1.6
        System.out.println("======");
        System.out.println("Task 6");
        System.out.println("======");
        System.out.println("Changing every 'a' with '@' is look like this: " + text_5.replaceAll("a", "@"));
        System.out.println("==============");
        System.out.println(" ");

        //1.7
        System.out.println("======");
        System.out.println("Task 7");
        System.out.println("======");

        String text_7_1, text_7_2;
        text_7_1 = "Apple";
        text_7_2 = "Banana";
        System.out.println( text_7_1.compareTo(text_7_2) == 1 ? "Strings are equal" : "Strings are not equal");

        System.out.println("==============");
        System.out.println(" ");


        //1.8
        System.out.println("======");
        System.out.println("Task 8");
        System.out.println("======");

        System.out.println("index of a and Programming in task 5 text are: " + text_5.indexOf("a") + " and " + text_5.indexOf("Programming"));

        System.out.println("==============");
        System.out.println(" ");

        //1.9
        System.out.println("======");
        System.out.println("Task 9");
        System.out.println("======");

        String text_9_1, text_9_2;
        text_9_1 = "Hello, ";
        text_9_2 = "World!";

        System.out.println(text_9_1.concat(text_9_2));

        System.out.println("==============");
        System.out.println(" ");
    }
}
