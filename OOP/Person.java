public class Person {
    // Fields (or instance variables)
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Main method to create objects
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        person1.displayInfo();
        person2.displayInfo();
    }
}

//A class is a blueprint for objects. An object is an instance of a class.