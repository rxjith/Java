package Tutorial8;

// Base class
class Bird {
    public void fly() {
        System.out.println("Birds can fly in the sky.");
    }
}

// Derived class 1
class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

// Derived class 2
class Eagle extends Bird {
    @Override
    public void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdPolymorphismDemo {
    public static void main(String[] args) {
        // Create an array of Bird references holding objects of different bird types
        Bird[] birds = {
            new Bird(),
            new Sparrow(),
            new Eagle()
        };

        // Loop through the array and call fly() to demonstrate dynamic method dispatch
        System.out.println("=== Demonstrating Dynamic Method Dispatch ===");
        for (Bird b : birds) {
            b.fly(); // Resolves to the correct overridden method at runtime
        }
    }
}
