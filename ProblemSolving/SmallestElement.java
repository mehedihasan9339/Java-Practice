package ProblemSolving;

public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6};

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest element is: " + min);
    }
}

