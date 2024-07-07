package ProblemSolving;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest applied per time period: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of time periods the money is invested for: ");
        int t = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / n), n * t);
        double compoundInterest = amount - principal;

        System.out.println("Compound Interest: " + compoundInterest);
    }
}

