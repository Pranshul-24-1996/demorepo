package org.example.oops_4.Interfaces;

public interface Animals {
    void eat();
    // It is not mandatory to write 'public' and 'abstract' before an abstract method
    public abstract void walk(); // Modifier 'abstract' is redundant for interface methods
    void run();

    // Two interfaces can have same method names
}
