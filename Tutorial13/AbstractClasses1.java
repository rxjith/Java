package Tutorial13;

// 1. Abstract Shape class
abstract class Shape {
    abstract void numberOfSides();
    abstract void sumOfAngles();
}

// 2. Rectangle Class
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle sides: 4");
    }

    @Override
    void sumOfAngles() {
        // Formula: (n - 2) * 180 where n is number of sides (4)
        int sides = 4;
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles for a Rectangle: " + sum + " degrees");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle sides: 3");
    }

    @Override
    void sumOfAngles() {
        int sides = 3;
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles for a Triangle: " + sum + " degrees");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon sides: 6");
    }

    @Override
    void sumOfAngles() {
        int sides = 6;
        int sum = (sides - 2) * 180;
        System.out.println("Sum of angles for a Hexagon: " + sum + " degrees");
    }
}

public class AbstractClasses1 {
    public static void main(String[] args) {
        Shape shape[] = {new Rectangle(), new Triangle(), new Hexagon()};

        for (Shape s : shape) {
            s.numberOfSides();
            s.sumOfAngles();
        }
    }
}
