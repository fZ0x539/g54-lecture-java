package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // printAli();
        // checkLeapYear();
        // calculateNumbers();
        // printAverageOf();
        // printName();
        // calculateInput();
        // convertTimeUnit();
        guessNumber();
    }

    public static void printAli(){
        System.out.println("Hello\nAli!");
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

    public static void printAverageOf(){
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

    public static void guessNumber(){
        //Generate between 1-500 while making it an int for the sake of simplicity
        int randomNum = (int) (Math.random() * 500) + 1;
        System.out.println("Enter a number between 1-500: ");

        int numberOfAttempts = 0;
        var scanner = new Scanner(System.in);
        int guessInput = 0;

        while(guessInput != randomNum){
            numberOfAttempts++;
            guessInput = scanner.nextInt();
            if(guessInput < randomNum)
                System.out.println("Your guess was too small. ");
            else if (guessInput > randomNum)
                System.out.println("Your guess was too big. ");
        }
        System.out.println("Congratulations, you guessed the correct number " + randomNum + " in " + numberOfAttempts + " attempt(s)!");

    }

}