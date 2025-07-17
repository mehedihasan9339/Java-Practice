public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("=== SWITCH CASE DEMONSTRATION ===\n");
        
        // 1. BASIC SWITCH STATEMENT
        System.out.println("1. BASIC SWITCH STATEMENT:");
        System.out.println("--------------------------");
        
        int day = 3;
        System.out.println("Day number: " + day);
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }
        
        // 2. SWITCH WITH CHAR
        System.out.println("\n2. SWITCH WITH CHARACTER:");
        System.out.println("-------------------------");
        
        char grade = 'B';
        System.out.println("Grade: " + grade);
        switch (grade) {
            case 'A':
                System.out.println("Excellent! 90-100%");
                break;
            case 'B':
                System.out.println("Good! 80-89%");
                break;
            case 'C':
                System.out.println("Average! 70-79%");
                break;
            case 'D':
                System.out.println("Below Average! 60-69%");
                break;
            case 'F':
                System.out.println("Fail! Below 60%");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        // 3. SWITCH WITH STRING (Java 7+)
        System.out.println("\n3. SWITCH WITH STRING:");
        System.out.println("----------------------");
        
        String month = "January";
        System.out.println("Month: " + month);
        switch (month) {
            case "January":
                System.out.println("Winter month - 31 days");
                break;
            case "February":
                System.out.println("Winter month - 28/29 days");
                break;
            case "March":
                System.out.println("Spring month - 31 days");
                break;
            case "April":
                System.out.println("Spring month - 30 days");
                break;
            case "May":
                System.out.println("Spring month - 31 days");
                break;
            case "June":
                System.out.println("Summer month - 30 days");
                break;
            case "July":
                System.out.println("Summer month - 31 days");
                break;
            case "August":
                System.out.println("Summer month - 31 days");
                break;
            case "September":
                System.out.println("Autumn month - 30 days");
                break;
            case "October":
                System.out.println("Autumn month - 31 days");
                break;
            case "November":
                System.out.println("Autumn month - 30 days");
                break;
            case "December":
                System.out.println("Winter month - 31 days");
                break;
            default:
                System.out.println("Invalid month name");
        }
        
        // 4. SWITCH WITHOUT BREAK (FALL-THROUGH)
        System.out.println("\n4. SWITCH FALL-THROUGH:");
        System.out.println("-----------------------");
        
        int number = 2;
        System.out.println("Number: " + number);
        switch (number) {
            case 1:
                System.out.println("One");
                // No break - falls through to next case
            case 2:
                System.out.println("Two or after One");
                // No break - falls through to next case
            case 3:
                System.out.println("Three or after Two");
                break;
            default:
                System.out.println("Other number");
        }
        
        // 5. MULTIPLE CASES FOR SAME ACTION
        System.out.println("\n5. MULTIPLE CASES:");
        System.out.println("------------------");
        
        char vowel = 'e';
        System.out.println("Character: " + vowel);
        switch (vowel) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel!");
                break;
            default:
                System.out.println("It's a consonant!");
        }
        
        // 6. SWITCH WITH CALCULATIONS
        System.out.println("\n6. CALCULATOR USING SWITCH:");
        System.out.println("----------------------------");
        
        double num1 = 10.5;
        double num2 = 3.2;
        char operator = '+';
        double result = 0;
        
        System.out.println("Calculation: " + num1 + " " + operator + " " + num2);
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
        
        // 7. SEASON DETERMINATION
        System.out.println("\n7. SEASON DETERMINATION:");
        System.out.println("------------------------");
        
        int monthNumber = 7;
        String season;
        
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Invalid month";
        }
        System.out.println("Month " + monthNumber + " is in " + season);
        
        // 8. MENU SYSTEM
        System.out.println("\n8. MENU SYSTEM:");
        System.out.println("---------------");
        
        int choice = 2;
        System.out.println("Menu Choice: " + choice);
        System.out.println("1. Create new file");
        System.out.println("2. Open existing file");
        System.out.println("3. Save file");
        System.out.println("4. Exit");
        
        switch (choice) {
            case 1:
                System.out.println("Creating new file...");
                break;
            case 2:
                System.out.println("Opening existing file...");
                break;
            case 3:
                System.out.println("Saving file...");
                break;
            case 4:
                System.out.println("Exiting application...");
                break;
            default:
                System.out.println("Invalid choice! Please select 1-4.");
        }
        
        // 9. SWITCH WITH ENUMS
        System.out.println("\n9. SWITCH WITH ENUMS:");
        System.out.println("---------------------");
        
        // Define enum inside main method for demo
        enum Size {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }
        
        Size pizzaSize = Size.LARGE;
        double price = 0;
        
        switch (pizzaSize) {
            case SMALL:
                price = 8.99;
                break;
            case MEDIUM:
                price = 12.99;
                break;
            case LARGE:
                price = 16.99;
                break;
            case EXTRA_LARGE:
                price = 19.99;
                break;
        }
        System.out.println("Pizza size: " + pizzaSize + ", Price: $" + price);
        
        // 10. SWITCH VS IF-ELSE COMPARISON
        System.out.println("\n10. SWITCH VS IF-ELSE:");
        System.out.println("----------------------");
        
        int score = 85;
        
        // Using switch (not ideal for ranges)
        System.out.println("Score: " + score);
        System.out.println("Using switch (limited for ranges):");
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("Grade: A");
                break;
            case 8:
                System.out.println("Grade: B");
                break;
            case 7:
                System.out.println("Grade: C");
                break;
            case 6:
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
        }
        
        // Using if-else (better for ranges)
        System.out.println("\nUsing if-else (better for ranges):");
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else if (score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        // 11. NESTED SWITCH
        System.out.println("\n11. NESTED SWITCH:");
        System.out.println("------------------");
        
        String category = "Electronics";
        String subcategory = "Mobile";
        
        switch (category) {
            case "Electronics":
                System.out.println("Electronics category selected");
                switch (subcategory) {
                    case "Mobile":
                        System.out.println("Mobile phones section");
                        break;
                    case "Laptop":
                        System.out.println("Laptop section");
                        break;
                    case "TV":
                        System.out.println("Television section");
                        break;
                    default:
                        System.out.println("General electronics");
                }
                break;
            case "Clothing":
                System.out.println("Clothing category selected");
                switch (subcategory) {
                    case "Shirts":
                        System.out.println("Shirts section");
                        break;
                    case "Pants":
                        System.out.println("Pants section");
                        break;
                    default:
                        System.out.println("General clothing");
                }
                break;
            default:
                System.out.println("Unknown category");
        }
        
        // 12. BEST PRACTICES
        System.out.println("\n12. BEST PRACTICES:");
        System.out.println("-------------------");
        
        System.out.println("✓ Always use break statements (unless fall-through is intended)");
        System.out.println("✓ Always include a default case");
        System.out.println("✓ Use switch for exact value matching");
        System.out.println("✓ Use if-else for ranges and complex conditions");
        System.out.println("✓ Switch is more readable for multiple fixed values");
        System.out.println("✓ Switch works with: int, char, String, enum");
        System.out.println("✗ Switch doesn't work with: long, float, double, boolean");
        
        System.out.println("\n=== END OF SWITCH CASE DEMONSTRATION ===");
    }
}
