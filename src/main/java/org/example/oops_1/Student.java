package org.example.oops_1;

public class Student {
    String name;
    int age;
    float psp;

    void changeBatch() {
        System.out.println(name + " has changed batch");
    }

    void joinClass() {
        System.out.println(name + " has joined class");
    }

    void printDetails() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("PSP: "+psp);
    }
}
