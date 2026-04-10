public class day11 {

    static class Student {
        String name;
        int age;

        public void printInfo(String name) {
            System.out.println(name);
        }

        public void printInfo(int age) {
            System.out.println(age);
        }

        public void printInfo(int age, String name) {
            System.out.println(age + " " + name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ashish";
        s1.age = 20;

        // Calling overloaded methods
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.age, s1.name);
    }
}