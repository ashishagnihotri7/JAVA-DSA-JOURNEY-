// MULTILEVEL INHERITANCE

class Animal {
    String name;

    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class day11_multi_inher {
    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.name = "Tommy";

        // Access all methods
        p1.eat();   // from Animal
        p1.bark();  // from Dog
        p1.weep();  // from Puppy

        System.out.println("Name: " + p1.name);
    }
}