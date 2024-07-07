package ProblemSolving;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8, 6};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Average is: " + average);
    }
}
