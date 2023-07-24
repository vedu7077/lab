package com.Array;
import java.util.Scanner;

public class StudentArrayPercentage {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[3];

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Loop to get information for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            // Get student ID
            System.out.print("ID: ");
            int id = sc.nextInt();

            // Clear the input buffer
            sc.nextLine();

            // Get student name
            System.out.print("Name: ");
            String name = sc.nextLine();

            // Get student marks
            System.out.print("Marks: ");
            int marks = sc.nextInt();

            // Create a Student object and store the information in the array
            students[i] = new Student(id, name, marks);
        }

        // Calculate and print the percentage of all students
        System.out.println("\nStudent Percentage:");
        for (Student student : students) {
            student.calculatePercentage();
            student.displayPercentage();
        }
    }
}

class Student {
    int id;
    String name;
    double marks;
    double percentage;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void calculatePercentage() {
        percentage = (marks / 100.0) * 100.0;
    }

    public void displayPercentage() {
        System.out.println("ID: " + id + ", Name: " + name + ", Percentage: " + percentage + "%");
    }
}
