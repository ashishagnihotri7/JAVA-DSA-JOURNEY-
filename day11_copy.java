///////////  copy constructor ////
class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void printInfo() {
        System.out.println(this.name + " " + this.age);
    }
}

public class day11_copy {
    public static void main(String[] args) {

        // First object
        Student s1 = new Student();
        s1.name = "Ashish";
        s1.age = 20;

        // Copying object
        Student s2 = new Student(s1);

        // Print copied data
        s2.printInfo();
    }
}