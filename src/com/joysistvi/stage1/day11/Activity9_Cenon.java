package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Activity9_Cenon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Average Calculator");

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();

        String[] subjectNames = new String[subjects];
        String[] studentNames = new String[students];
        double[][] grades = new double[students][subjects];


        System.out.println("\nEnter subject names:");

        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.next();
        }

        for (int i = 0; i < students; i++) {

            System.out.print("\nName of Student " + (i + 1) + ": ");
            studentNames[i] = input.next();

            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
            }
        }

        System.out.println("\nGrades Report");

        System.out.printf("%-20s", "Student");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-12s", subjectNames[i]);
        }

        System.out.println("Average");


        for (int i = 0; i < students; i++) {

            System.out.printf("%-20s", studentNames[i]);

            double sum = 0;

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.0f", grades[i][j]);
                sum += grades[i][j];
            }

            double average = sum / subjects;

            System.out.printf("%.2f%n", average);
        }

        input.close();
    }


}
