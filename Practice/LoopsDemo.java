public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== LOOPS DEMONSTRATION ===\n");
        
        // 1. FOR LOOP
        System.out.println("1. FOR LOOP:");
        System.out.println("------------");
        
        // Basic for loop
        System.out.println("Basic for loop (1 to 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // For loop with different increments
        System.out.println("\nFor loop with increment of 2:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Reverse for loop
        System.out.println("\nReverse for loop (10 to 1):");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // 2. WHILE LOOP
        System.out.println("\n\n2. WHILE LOOP:");
        System.out.println("---------------");
        
        // Basic while loop
        System.out.println("Basic while loop (countdown from 5):");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println("Blast off!");
        
        // While loop with condition
        System.out.println("\nWhile loop - doubling numbers:");
        int number = 1;
        while (number <= 100) {
            System.out.print(number + " ");
            number *= 2;
        }
        System.out.println();
        
        // 3. DO-WHILE LOOP
        System.out.println("\n\n3. DO-WHILE LOOP:");
        System.out.println("------------------");
        
        // Basic do-while loop
        System.out.println("Do-while loop (executes at least once):");
        int num = 10;
        do {
            System.out.print(num + " ");
            num--;
        } while (num > 5);
        System.out.println();
        
        // Do-while with false condition (still executes once)
        System.out.println("\nDo-while with false condition:");
        int x = 0;
        do {
            System.out.println("This executes once even though condition is false");
            x++;
        } while (x < 0);
        
        // 4. ENHANCED FOR LOOP (for-each)
        System.out.println("\n\n4. ENHANCED FOR LOOP (for-each):");
        System.out.println("----------------------------------");
        
        // Array iteration
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Iterating through array:");
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // String array iteration
        String[] fruits = {"Apple", "Banana", "Orange", "Grape"};
        System.out.println("\nIterating through string array:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        // 5. NESTED LOOPS
        System.out.println("\n\n5. NESTED LOOPS:");
        System.out.println("----------------");
        
        // Multiplication table
        System.out.println("Multiplication table (3x3):");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        
        // Pattern printing
        System.out.println("\nStar pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 6. BREAK STATEMENT
        System.out.println("\n\n6. BREAK STATEMENT:");
        System.out.println("-------------------");
        
        System.out.println("Finding first number divisible by 7:");
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                System.out.println("Found: " + i);
                break; // Exit the loop
            }
        }
        
        // Break in nested loops
        System.out.println("\nBreak in nested loops:");
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking outer loop at i=" + i + ", j=" + j);
                    break outerLoop;
                }
                System.out.println("i=" + i + ", j=" + j);
            }
        }
        
        // 7. CONTINUE STATEMENT
        System.out.println("\n\n7. CONTINUE STATEMENT:");
        System.out.println("----------------------");
        
        System.out.println("Printing only odd numbers (1-10):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Continue in while loop
        System.out.println("\nSkipping multiples of 3:");
        int counter = 0;
        while (counter < 15) {
            counter++;
            if (counter % 3 == 0) {
                continue;
            }
            System.out.print(counter + " ");
        }
        System.out.println();
        
        // 8. PRACTICAL EXAMPLES
        System.out.println("\n\n8. PRACTICAL EXAMPLES:");
        System.out.println("----------------------");
        
        // Sum of numbers
        System.out.println("Sum of numbers 1 to 100:");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        
        // Factorial calculation
        System.out.println("\nFactorial of 5:");
        int factorial = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("5! = " + factorial);
        
        // Finding prime numbers
        System.out.println("\nPrime numbers from 1 to 20:");
        for (int i = 2; i <= 20; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        // Fibonacci sequence
        System.out.println("\nFibonacci sequence (first 10 numbers):");
        int first = 0, second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < 10; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
        
        // 9. INFINITE LOOPS (BE CAREFUL!)
        System.out.println("\n\n9. INFINITE LOOPS (controlled):");
        System.out.println("--------------------------------");
        
        // Controlled infinite loop with break
        System.out.println("Controlled infinite loop (stops at 5):");
        int infiniteCounter = 1;
        while (true) {
            System.out.print(infiniteCounter + " ");
            if (infiniteCounter == 5) {
                break;
            }
            infiniteCounter++;
        }
        System.out.println();
        
        // 10. PERFORMANCE COMPARISON
        System.out.println("\n\n10. LOOP PERFORMANCE TIPS:");
        System.out.println("---------------------------");
        
        // Efficient array processing
        int[] largeArray = new int[1000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i + 1;
        }
        
        // Method 1: Traditional for loop
        long startTime = System.currentTimeMillis();
        long sumTraditional = 0;
        for (int i = 0; i < largeArray.length; i++) {
            sumTraditional += largeArray[i];
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Traditional for loop sum: " + sumTraditional + " (Time: " + (endTime - startTime) + "ms)");
        
        // Method 2: Enhanced for loop
        startTime = System.currentTimeMillis();
        long sumEnhanced = 0;
        for (int value : largeArray) {
            sumEnhanced += value;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Enhanced for loop sum: " + sumEnhanced + " (Time: " + (endTime - startTime) + "ms)");
        
        System.out.println("\n=== END OF LOOPS DEMONSTRATION ===");
    }
}
