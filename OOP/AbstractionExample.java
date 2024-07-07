abstract class Animal {
    abstract void sound(); // Abstract method

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound(); // Outputs: Cat meows
        myCat.sleep(); // Outputs: This animal sleeps.
    }
}


//Abstraction is the concept of hiding the implementation details and showing only the functionality.

