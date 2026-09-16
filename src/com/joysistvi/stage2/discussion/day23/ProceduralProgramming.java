package com.joysistvi.stage2.discussion.day23;

public class ProceduralProgramming {

    // Procedural Programming Approach

    /*
        This programming style relies on procedures or routines (methods/function) to operate
        on data, where data and behavior are handled separately
     */

    // Example: We want to create a variable(s) that will describe a pet.
    // name , ageInMonths, classification, gender, sound, breed

    static String petAName = "Pusa";
    static int petAgeInMonths = 5;
    static String petClassification = "Cat";
    static String petGender = "Male";
    static String petSound = "Meow Meow";
    static String petBreed = "Persian";

    public static void describePet () {
        System.out.println(petAName + " is a " + petGender + " " + petClassification + " who is " +
                petAgeInMonths + " years of age in months and breed is " + petBreed);

    }

    public static void makeSound () {
        System.out.println(petAName + " says " + petSound + "!");
    }

    public static void main(String[] args) {
        //makeSound();
        //describePet();
    }

    // Limitations of Procedural Approach:

    /*
        The entity is not represented as a single unit, but rather a collection of separated variables
        (eg. multiples per pet)

        No data protection. Any part of the program can be modified or change the variables directly

     */

    // To address this issues, we can use encapsulation which allows us to bundles the data and methods that operates on the data
    // with in a single unit (class) and restrict access to some of the objects component

}
