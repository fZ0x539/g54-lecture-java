package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello\nAli!");
        /*checkLeapYear();*/
        /*calculateNumbers();*/
        /*printAverageOfNums();*/
        /*printName();*/
        /*calculateInput();*/
        convertTimeUnit();
    }

    public static void checkLeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        short year = scanner.nextShort();
        if(year % 4 == 0)
            System.out.println("Yes this is a leap year!");
        else
            System.out.println("No this isn't a leap year.");
    }

    public static void calculateNumbers(){
        System.out.println("45 + 11 = " + (45+11));
        System.out.println("12 * 4 = " + (12*4));
        System.out.println("24 / 6 = " + (24/6));
        System.out.println("55 - 12 = " + (55-12));
    }

    public static void printAverageOfNums(){
        System.out.println("(23 + 11 + 77) / 3 = " + ((23+11+77)/3));
    }

    public static void printName(){
        var scanner = new Scanner(System.in);
        System.out.print("Please enter your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    public static void calculateInput(){
        var scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers\nNum 1: ");
        double numOne = scanner.nextDouble();
        System.out.println("Num 2: ");
        double numTwo = scanner.nextDouble();
        System.out.println("Summary = " + (numOne + numTwo) );
        System.out.println("Difference = " + (numOne - numTwo));
        System.out.println("Product = " + (numOne * numTwo));
        System.out.println("Quotient = " + (numOne/numTwo ));
    }

    public static void convertTimeUnit(){
        var scanner = new Scanner(System.in);
        System.out.println("Input seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600)  / 60;
        int seconds = (totalSeconds % 3600) % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

}