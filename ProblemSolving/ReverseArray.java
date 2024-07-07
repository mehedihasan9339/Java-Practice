package ProblemSolving;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Reverse the array
        int n = numbers.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[n - 1 - i];
            numbers[n - 1 - i] = temp;
        }

        System.out.println("\nReversed array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

