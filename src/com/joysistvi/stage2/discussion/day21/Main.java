package com.joysistvi.stage2.discussion.day21;

public class Main {

    public static void main(String[] args) {

        Student stud = new Student(1, "Carl",20,
                "BSIT", "1A", "Malabon" );

        Student stud2 = new Student(2, "Winter", 35, "BSIT", "1A");

        Student[] students = new Student[3];
        students[0] = new Student(1, "Carl", 20, "BSIT",
                "1A", "Malabon");
        students[1] = new Student(2, "Winter", 24,
                "BSCPE", "2B");
        students[2] = new Student(3, "Summer", 24, "BSIT");


        //System.out.println(students[0]);

        for (Student student : students) {
            System.out.println(student);

            //System.out.println(student.getCourse());
        }


    }
}
