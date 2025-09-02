
interface Animal {

    // constant (public static final by default)
    int LEGS = 4;  

    // abstract method (public abstract by default)
    void sound();

    // default method (Java 8+) → provides body
    default void info() {
        System.out.println("I am an animal with " + LEGS + " legs.");
        showInternalMessage();  // calling private helper method
    }

    // static method (Java 8+) → belongs to interface itself
    static void staticInfo() {
        System.out.println("Static method in Animal interface.");
    }

    // private method (Java 9+) → used only inside this interface
    private void showInternalMessage() {
        System.out.println("This is a private helper method inside interface.");
    }
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class  C21_interfaceppart2{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();          // calls abstract method implementation
        d.info();           // calls default method
        Animal.staticInfo(); // calls static method directly from interface
    }
}
