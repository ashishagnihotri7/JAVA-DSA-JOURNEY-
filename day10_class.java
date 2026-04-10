import java.util.Scanner;

class pen {
    String color;
    String type;

    public static void Wriite() { //  Use static when method does NOT depend on object data
        System.out.println("write some thing");

    }

    public void printColour()
    {
        System.out.println(this.color + "  " + this.type); //this use taki pata chali kom se obj ni bulaya hai 
    }

 }
public class day10_class {

    public static void main(String[] args) {
        pen pe1 = new pen();
        pe1.color = "black";
        pe1.type = "gel";
        pe1.Wriite();
        pen p2 = new pen();
        p2.color = "red";
        p2.type = "gel";
        pe1.printColour();
        p2.printColour();
    }
}
