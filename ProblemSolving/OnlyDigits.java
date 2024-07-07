package ProblemSolving;

import java.util.Scanner;

public class OnlyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        boolean onlyDigits = str.chars().allMatch(Character::isDigit);

        if (onlyDigits) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }
}
