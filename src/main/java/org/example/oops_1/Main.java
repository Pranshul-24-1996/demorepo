package org.example.oops_1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Pranshul";
        student.age = 28;
        student.psp = 98;

        student.changeBatch();
        student.joinClass();
        student.printDetails();
    }
}
