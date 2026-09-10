package com.joysistvi.stage2.day19;

import java.util.Scanner;

public class StudentView {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = input.nextInt();

        input.nextLine();
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        Student stud = new Student(id, name,20,
                "BSIT", "1A", "Malabon" );


        System.out.println("\n\nStudent Profile");
        System.out.println("ID: " + stud.getId());
        System.out.println("Name: " + stud.getName());
        System.out.println("Age: " + stud.getAge());
        System.out.println("Course: " + stud.getCourse());
        System.out.println("Section: " + stud.getSection());
        System.out.println("Address: " + stud.getAddress());
    }
}
