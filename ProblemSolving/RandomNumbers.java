package ProblemSolving;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100); // Generates a random number between 0 and 99
            System.out.println("Random number " + (i + 1) + ": " + randomNumber);
        }
    }
}
