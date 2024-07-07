package Basics;

public class ArraysExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Another way to iterate through the array using enhanced for loop
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}

//An array is a container object that holds a fixed number of values of a single type.

