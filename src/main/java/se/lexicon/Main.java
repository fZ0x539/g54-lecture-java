package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello\nAli!");
        /*checkLeapYear();*/
        /*calculateNumbers();*/
        /*printAverageOfNums();*/
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


}