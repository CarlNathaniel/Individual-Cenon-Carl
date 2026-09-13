package com.joysistvi.stage2.discussion.day21;

public class Student {

    // private data members / fields
    private int id;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;
    private final String schoolName = "Joysis TVI";


    // default constructor
    // kung ano pangalan ng class same din ng pangalan ung constructor
    public Student () {

    }


    // parameterized constructor
    public Student (int id, String name, int age, String course,
                    String section, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;

    }

    public Student (int id, String name, int age, String course,
                    String section) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
    }

    public Student (int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }



    // alt + insert
    // data validation
    // getter method / access method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public String getSection() {
        return section;
    }

    public String getAddress() {
        return address;
    }

    public String getSchoolName() {
        return schoolName;
    }

    // setter method / mutator method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAddress(String address) {
        if (address != null && address.trim().length() >= 5) {
            this.address = address;
        } else {
            this.address = "Unknown"; // fallback value
        }

    }
    // Object Method
    public void displayStudentInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                ", schoolName ='" + schoolName + '\'' +
                '}';
    }
}

