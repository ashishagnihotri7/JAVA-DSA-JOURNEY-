class Shape {
    String colour;
}

class Triangle extends Shape {
}

public class day11_inherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.colour = "red";
        System.out.println(t1.colour);
    }
}