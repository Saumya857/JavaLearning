/*	•	What Are Sealed Classes?:
	•	Sealed classes restrict which other classes or interfaces can extend/implement them.
	•	Provides more control over class hierarchies.*/

sealed class Shape permits Circle, Rectangle {
    // Common properties for all shapes
}

final class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
}

final class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

public class SealedClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Created shapes: Circle and Rectangle.");
    }
}