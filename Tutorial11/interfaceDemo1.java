package Tutorial11;

// 1. Interface
interface Pet {
    String getName();
    void setName(String name);
    void play();
}

// 2. Concrete Base Class (not abstract)
class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// 3. Spider Class
class Spider extends Animal {
    public Spider() {
        super(8); // Spiders have 8 legs
    }

    @Override
    public void eat() {
        System.out.println("The spider eats insects.");
    }
}

// 4. Cat Class
class Cat extends Animal implements Pet {
    private String name;

    public Cat(String name) {
        super(4); // Cats have 4 legs
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string and chase mice.");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats fish and cat food.");
    }
}

// 5. Fish Class
class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0); // Fish have 0 legs
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " the fish swims around in its tank.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk, they swim!");
    }

    @Override
    public void eat() {
        System.out.println("The fish eats flake food.");
    }
}

// 6. Main / Driver Class
public class interfaceDemo1 {
    public static void main(String[] args) {
        // Testing Fish
        Fish d = new Fish();
        d.setName("Nemo");
        System.out.println("--- Fish ---");
        System.out.println("Pet Name: " + d.getName());
        d.walk();
        d.eat();
        d.play();

        // Testing Cat
        Cat c = new Cat("Fluffy");
        System.out.println("\n--- Cat ---");
        System.out.println("Pet Name: " + c.getName());
        c.walk();
        c.eat();
        c.play();

        // Testing Spider (Animal Reference)
        Animal a = new Spider();
        System.out.println("\n--- Spider (Animal Reference) ---");
        a.walk();
        a.eat();

        // Testing Pet (Interface Reference)
        Pet p = new Cat("Whiskers");
        System.out.println("\n--- Cat (Pet Reference) ---");
        System.out.println("Pet Name: " + p.getName());
        p.play();
    }
}
