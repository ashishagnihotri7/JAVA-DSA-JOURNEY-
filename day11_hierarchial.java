import java.util.Scanner;

class Shap {
    String colour;

    public void display() {
        System.out.println("Color: " + colour);
    }
}

class Circle extends Shap {
    public void area() {
        System.out.println("Area of circle");
    }
}

class Rectangle extends Shap {
    public void area() {
        System.out.println("Area of rectangle");
    }
}

public class day11_hierarchial {
    public static void main(String[] args) {

        // Circle object
        Circle c1 = new Circle();   // ✔ fixed
        c1.colour = "red";
        c1.display();
        c1.area();

        // Rectangle object
        Rectangle r1 = new Rectangle();
        r1.colour = "blue";
        r1.display();
        r1.area();
    }
}