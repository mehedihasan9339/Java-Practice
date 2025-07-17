public class Main {
    public static void main(String[] args) {
        System.out.println("=== JAVA DATA TYPES DEMONSTRATION ===\n");
        
        // 1. PRIMITIVE DATA TYPES
        System.out.println("1. PRIMITIVE DATA TYPES:");
        System.out.println("------------------------");
        
        // Integer types
        byte byteValue = 127;                    // 8-bit, range: -128 to 127
        short shortValue = 32767;                // 16-bit, range: -32,768 to 32,767
        int intValue = 2147483647;               // 32-bit, range: -2^31 to 2^31-1
        long longValue = 9223372036854775807L;   // 64-bit, range: -2^63 to 2^63-1
        
        System.out.println("Integer Types:");
        System.out.println("byte: " + byteValue + " (size: 1 byte)");
        System.out.println("short: " + shortValue + " (size: 2 bytes)");
        System.out.println("int: " + intValue + " (size: 4 bytes)");
        System.out.println("long: " + longValue + " (size: 8 bytes)");
        
        // Floating-point types
        float floatValue = 3.14159f;             // 32-bit IEEE 754 floating point
        double doubleValue = 3.141592653589793;  // 64-bit IEEE 754 floating point
        
        System.out.println("\nFloating-Point Types:");
        System.out.println("float: " + floatValue + " (size: 4 bytes)");
        System.out.println("double: " + doubleValue + " (size: 8 bytes)");
        
        // Character type
        char charValue = 'A';                    // 16-bit Unicode character
        char unicodeChar = '\u0041';             // Unicode representation of 'A'
        
        System.out.println("\nCharacter Type:");
        System.out.println("char: " + charValue + " (size: 2 bytes)");
        System.out.println("char (Unicode): " + unicodeChar + " (Unicode: \\u0041)");
        
        // Boolean type
        boolean booleanTrue = true;
        boolean booleanFalse = false;
        
        System.out.println("\nBoolean Type:");
        System.out.println("boolean: " + booleanTrue + " / " + booleanFalse + " (size: 1 bit)");
        
        // 2. REFERENCE DATA TYPES
        System.out.println("\n\n2. REFERENCE DATA TYPES:");
        System.out.println("-------------------------");
        
        // String (most common reference type)
        String stringValue = "Hello, Java!";
        String emptyString = "";
        String nullString = null;
        
        System.out.println("String Type:");
        System.out.println("String: \"" + stringValue + "\"");
        System.out.println("Empty String: \"" + emptyString + "\"");
        System.out.println("Null String: " + nullString);
        
        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        
        System.out.println("\nArray Types:");
        System.out.print("int array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        
        System.out.print("String array: ");
        for (String fruit : stringArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();
        
        // 3. WRAPPER CLASSES (Boxing/Unboxing)
        System.out.println("\n\n3. WRAPPER CLASSES:");
        System.out.println("--------------------");
        
        Integer integerWrapper = 42;              // Auto-boxing
        Double doubleWrapper = 3.14;              // Auto-boxing
        Boolean booleanWrapper = true;            // Auto-boxing
        Character charWrapper = 'X';              // Auto-boxing
        
        System.out.println("Integer wrapper: " + integerWrapper);
        System.out.println("Double wrapper: " + doubleWrapper);
        System.out.println("Boolean wrapper: " + booleanWrapper);
        System.out.println("Character wrapper: " + charWrapper);
        
        // Auto-unboxing
        int unboxedInt = integerWrapper;          // Auto-unboxing
        System.out.println("Unboxed int: " + unboxedInt);
        
        // 4. TYPE CONVERSION EXAMPLES
        System.out.println("\n\n4. TYPE CONVERSION:");
        System.out.println("-------------------");
        
        // Implicit conversion (widening)
        int intForConversion = 100;
        long longFromInt = intForConversion;      // int to long
        double doubleFromInt = intForConversion;  // int to double
        
        System.out.println("Implicit conversion:");
        System.out.println("int " + intForConversion + " -> long " + longFromInt);
        System.out.println("int " + intForConversion + " -> double " + doubleFromInt);
        
        // Explicit conversion (narrowing)
        double doubleForConversion = 9.99;
        int intFromDouble = (int) doubleForConversion;  // Casting required
        
        System.out.println("\nExplicit conversion:");
        System.out.println("double " + doubleForConversion + " -> int " + intFromDouble + " (truncated)");
        
        // 5. SPECIAL VALUES
        System.out.println("\n\n5. SPECIAL VALUES:");
        System.out.println("------------------");
        
        // Special floating-point values
        double positiveInfinity = Double.POSITIVE_INFINITY;
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        double notANumber = Double.NaN;
        
        System.out.println("Positive Infinity: " + positiveInfinity);
        System.out.println("Negative Infinity: " + negativeInfinity);
        System.out.println("NaN (Not a Number): " + notANumber);
        
        // Min and Max values
        System.out.println("\nMin/Max values:");
        System.out.println("int MIN: " + Integer.MIN_VALUE);
        System.out.println("int MAX: " + Integer.MAX_VALUE);
        System.out.println("double MIN: " + Double.MIN_VALUE);
        System.out.println("double MAX: " + Double.MAX_VALUE);
        
        // 6. CONSTANTS
        System.out.println("\n\n6. CONSTANTS:");
        System.out.println("-------------");
        
        final int CONSTANT_INT = 100;
        final String CONSTANT_STRING = "This cannot be changed";
        
        System.out.println("final int: " + CONSTANT_INT);
        System.out.println("final String: " + CONSTANT_STRING);
        
        System.out.println("\n=== END OF DATA TYPES DEMONSTRATION ===");
    }
}
