                 ////////////// perameterised constructor //////////////////
import java.util.Scanner;

class Student {
    String name;
    int age;
 public void showInfo()
    {
        System.out.println(this.name + " " + this.age);
    }
  Student(String name, int age)
    {
    this.name = name;
    this.age = age;
 }
}
public class day11_2con {

    public static void main(String[] args) {
        Student s1 = new Student("ashish", 12);
        s1.showInfo();
    }
}