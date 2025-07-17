public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("=== IF-ELSE STATEMENT DEMONSTRATION ===\n");
        
        // 1. SIMPLE IF STATEMENT
        System.out.println("1. SIMPLE IF STATEMENT:");
        System.out.println("-----------------------");
        
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult! Age: " + age);
        }
        
        int temperature = 25;
        if (temperature > 30) {
            System.out.println("It's hot outside!");
        }
        System.out.println("Current temperature: " + temperature + "°C");
        
        // 2. IF-ELSE STATEMENT
        System.out.println("\n2. IF-ELSE STATEMENT:");
        System.out.println("---------------------");
        
        int score = 85;
        if (score >= 60) {
            System.out.println("Congratulations! You passed with score: " + score);
        } else {
            System.out.println("Sorry, you failed with score: " + score);
        }
        
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("Take an umbrella!");
        } else {
            System.out.println("No need for umbrella today.");
        }
        
        // 3. IF-ELSE-IF LADDER
        System.out.println("\n3. IF-ELSE-IF LADDER:");
        System.out.println("----------------------");
        
        int marks = 92;
        if (marks >= 90) {
            System.out.println("Grade: A+ (Excellent!) - Marks: " + marks);
        } else if (marks >= 80) {
            System.out.println("Grade: A (Very Good!) - Marks: " + marks);
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good!) - Marks: " + marks);
        } else if (marks >= 60) {
            System.out.println("Grade: C (Average) - Marks: " + marks);
        } else if (marks >= 50) {
            System.out.println("Grade: D (Below Average) - Marks: " + marks);
        } else {
            System.out.println("Grade: F (Fail) - Marks: " + marks);
        }
        
        // 4. NESTED IF STATEMENTS
        System.out.println("\n4. NESTED IF STATEMENTS:");
        System.out.println("------------------------");
        
        int studentAge = 20;
        boolean hasLicense = true;
        boolean hasInsurance = false;
        
        if (studentAge >= 18) {
            System.out.println("Student is eligible to drive (age: " + studentAge + ")");
            if (hasLicense) {
                System.out.println("Student has a valid license");
                if (hasInsurance) {
                    System.out.println("✓ Student can drive legally!");
                } else {
                    System.out.println("✗ Student needs insurance to drive");
                }
            } else {
                System.out.println("✗ Student needs to get a license first");
            }
        } else {
            System.out.println("✗ Student is too young to drive");
        }
        
        // 5. LOGICAL OPERATORS IN IF STATEMENTS
        System.out.println("\n5. LOGICAL OPERATORS:");
        System.out.println("---------------------");
        
        int num = 15;
        
        // AND operator (&&)
        if (num > 10 && num < 20) {
            System.out.println(num + " is between 10 and 20 (AND operator)");
        }
        
        // OR operator (||)
        if (num < 5 || num > 10) {
            System.out.println(num + " is either less than 5 OR greater than 10 (OR operator)");
        }
        
        // NOT operator (!)
        boolean isWeekend = false;
        if (!isWeekend) {
            System.out.println("It's a weekday, time to work! (NOT operator)");
        }
        
        // 6. TERNARY OPERATOR (? :)
        System.out.println("\n6. TERNARY OPERATOR:");
        System.out.println("--------------------");
        
        int number = 42;
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("Number " + number + " is " + result);
        
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);
        
        // 7. COMPARING STRINGS
        System.out.println("\n7. COMPARING STRINGS:");
        System.out.println("---------------------");
        
        String password = "Java123";
        String userInput = "Java123";
        
        if (password.equals(userInput)) {
            System.out.println("✓ Password correct! Access granted.");
        } else {
            System.out.println("✗ Password incorrect! Access denied.");
        }
        
        String name = "John";
        if (name.equalsIgnoreCase("JOHN")) {
            System.out.println("✓ Name matches (case-insensitive): " + name);
        }
        
        // 8. CHECKING NULL VALUES
        System.out.println("\n8. NULL CHECKING:");
        System.out.println("-----------------");
        
        String message = null;
        String anotherMessage = "Hello World!";
        
        if (message != null) {
            System.out.println("Message: " + message);
        } else {
            System.out.println("Message is null, using default: '" + anotherMessage + "'");
        }
        
        if (anotherMessage != null && !anotherMessage.isEmpty()) {
            System.out.println("Another message is valid: " + anotherMessage);
        }
        
        // 9. COMPLEX CONDITIONS
        System.out.println("\n9. COMPLEX CONDITIONS:");
        System.out.println("----------------------");
        
        int hour = 14; // 2 PM
        boolean isHoliday = false;
        boolean hasWork = true;
        
        if ((hour >= 9 && hour <= 17) && !isHoliday && hasWork) {
            System.out.println("Time to work! Current hour: " + hour);
        } else if (isHoliday || !hasWork) {
            System.out.println("Enjoy your free time!");
        } else {
            System.out.println("It's outside working hours.");
        }
        
        // 10. PRACTICAL EXAMPLES
        System.out.println("\n10. PRACTICAL EXAMPLES:");
        System.out.println("-----------------------");
        
        // BMI Calculator
        double weight = 70.0; // kg
        double height = 1.75; // meters
        double bmi = weight / (height * height);
        
        System.out.println("BMI: " + String.format("%.2f", bmi));
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }
        
        // Temperature converter
        double celsius = 25.0;
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("\nTemperature: " + celsius + "°C = " + fahrenheit + "°F");
        if (celsius < 0) {
            System.out.println("Water freezes at this temperature!");
        } else if (celsius >= 100) {
            System.out.println("Water boils at this temperature!");
        } else {
            System.out.println("Water is liquid at this temperature.");
        }
        
        System.out.println("\n=== END OF IF-ELSE DEMONSTRATION ===");
    }
}
