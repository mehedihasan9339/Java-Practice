package ProblemSolving;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}

