public class EncapsulationExample {
    // Private variables
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        EncapsulationExample person = new EncapsulationExample();
        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

//Encapsulation is the mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.
