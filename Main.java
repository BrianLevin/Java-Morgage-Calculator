import java.text.NumberFormat; // java class for formatting and parsing numbers
import java.util.Scanner; // java class for for reading input with the keyboard

public class Main {  // main object class  which will hold all the methods

    public static void main(String[] args) { // The main method which where the program starts Public= Global Access, Static= invoked without isntating class to save memory, Void= Doesnt return anything once program terminates , main: main method starting point that JVM looks for, String args, stores java command line arguments as strings and args are not fixed and can use an name in place of it.
        final byte MONTHS_IN_YEAR = 12; // byte= 8 bit storgae  final= constant
        final byte PERCENT = 100;
        
        int principal = 0; // Set intial values to zero
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in); // scanner obtains  the input data  of primitive types and strings new creates a new instance

       while (true) { // while loop to determine if input values match
        System.out.print("Principal: "); // Print out the principle
        principal = scanner.nextInt(); // scan the principle as an integer which is a 32 bit number
         if (principal >= 1000 && principal <= 1_000_000) // condition for loan for method to proceed
                break;
            System.out.println("Enter a value between 1000 and 1000000"); // message will printed on screen if values are incorrect
        }

        System.out.print("Annual Interest Rate: "); // print out the annual interest
        float annualInterest = scanner.nextFloat(); // scan the anual interest which will come out as a decimal number
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR; // calculation to get the montly interest

        System.out.print("Period (Years): "); // print out the Period in years
        byte years = scanner.nextByte(); //  years will be scanned as a byte
        int numberOfPayments = years * MONTHS_IN_YEAR; // number of payments will be stored as a integer

        double mortgage = principal
                    * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1); // morgage calculation

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); // Method which willl format the morgage  as a value to be displayed
        System.out.println("Mortgage: " + mortgageFormatted); // print the morgage on the screen


    }

}