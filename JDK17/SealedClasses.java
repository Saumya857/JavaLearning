/*	•	What Are Sealed Classes?:
	•	Sealed classes restrict which other classes or interfaces can extend/implement them.
	•	Provides more control over class hierarchies.*/

// Sealed base class 'Shape' permits only Circle and Rectangle to extend it
public sealed class Shape permits Circle, Rectangle {
    public abstract double area();
}

// Permitted subclass: Circle can extend Shape
public final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Permitted subclass: Rectangle can extend Shape
public final class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Non-permitted subclass: Triangle is NOT allowed to extend Shape
// This will cause a compile-time error!
// public final class Triangle extends Shape {
//     private final double base;
//     private final double height;

//     public Triangle(double base, double height) {
//         this.base = base;
//         this.height = height;
//     }

//     @Override
//     public double area() {
//         return 0.5 * base * height;
//     }
// }

public class SealedClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Trying to instantiate Triangle will cause a compilation error because
        // Triangle is not permitted to extend Shape.
        // Shape triangle = new Triangle(3.0, 4.0);
    }

    //########### Key Benefits ##############//
    /*	
	•	Helps model exhaustiveness, useful in pattern matching and inheritance.
	•	Improves clarity by defining all possible subclasses in one place.*/
    
}