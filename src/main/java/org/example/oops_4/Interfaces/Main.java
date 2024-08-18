package org.example.oops_4.Interfaces;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.walk();
        a1.run();

        //a1 = new Animal();  // Animal' is abstract; cannot be instantiated
    }
}
