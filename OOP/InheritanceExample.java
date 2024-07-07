// Base class (or super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (or sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // method from Animal class
        dog.bark(); // method from Dog class
    }
}


// Inheritance allows a class to inherit fields and methods from another class.
