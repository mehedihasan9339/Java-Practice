package Practice.RandomPractice;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte MONTH_IN_YEAR = 12;
    final static byte PERCENT = 100;
    private  static final Scanner scanner = new Scanner(System.in);
    /**
     * Mortgage Calculator
     * This program calculates the mortgage payment based on user input for principal, annual interest rate, and period in years.
     */
    public static void main(String[] args) {
        int principal = (int) readNumber("Principal (1K - 1M)", 1000, 1000000);

        float annualInterestRate = readNumber("Annual Interest Rate (1 - 30)", 1, 30);

        byte years = (byte) readNumber("Period (Years)", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterestRate, years);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("-------");
        System.out.println("Monthly Payments: " + mortgageFormatted);

        System.out.println("Payments Schedule");
        System.out.println("---------------");
        for (short month = 1; month <= years * MONTH_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            String balanceFormatted = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(balanceFormatted);
        }
    }

    public static float readNumber(String prompt, int min, int max){
        float value = 0;

        while(true){
            System.out.print(prompt + ": ");
            value = scanner.nextFloat();
            if(value >= min && value <= max) break;
            System.out.println("Enter a number between " + min + " and " + max + ".");
        }

        return value;
    }

    public static double calculateMortgage(int principal, float annualInterestRate, int years){
        return principal * (annualInterestRate / PERCENT / MONTH_IN_YEAR) /
                (1 - Math.pow(1 + annualInterestRate / PERCENT / MONTH_IN_YEAR, -years * MONTH_IN_YEAR));
    }



    public static double calculateBalance(int principal, float annualInterestRate, byte years, short numberOfPaymentsMade){
        float monthlyInterest = annualInterestRate / PERCENT / MONTH_IN_YEAR;

        float numberOfPayments = years * MONTH_IN_YEAR;

        double balance = principal * (Math.pow(1 + monthlyInterest, numberOfPayments) -
                Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        return balance;
    }
}
