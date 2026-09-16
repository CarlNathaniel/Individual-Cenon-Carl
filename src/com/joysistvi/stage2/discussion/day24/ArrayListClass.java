package com.joysistvi.stage2.discussion.day24;

import java.util.ArrayList; // import ArrayList from utility package
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {


        // Create an object of an ArrayList
        List<String> cars = new ArrayList<>();

        // CRUD Operation

        // Create / Add items
        cars.add("Bugatti"); // 0
        cars.add("Pickup"); // 2
        cars.add("BMW"); // 4
        cars.add(1,"Isuzu"); // 1
        cars.add(3,"SUV");
        cars.add("Click");


        // Read / get item
        //System.out.println(cars.get(4));
        //String newCars = cars.get(4);


        // Update / set item
        cars.set(4, "E-Bike");

        cars.set(0, "Limousine");
        //System.out.println(cars);

        // Delete / remove an item
        //cars.remove("E-Bike");

        //cars.remove(1);
        //System.out.println(cars);

        // Remove all items in the list
        //cars.removeAll(cars);
        //cars.clear();


        // Getting the size
        //System.out.println(cars.get(cars.size()-1));
        //System.out.println(cars.remove(cars.size() -2));
        //System.out.println(cars);


//        System.out.println("\nTraversing an ArrayList using for-loop: ");
//        for (int i = 0; i < cars.size(); i++) {
//
//            if ("Pickup".equals(cars.get(i))) {
//                continue;
//            }
//            System.out.println(cars.get(i));
//        }
//
//        // Continue - iiskip ung pickup
//        // Break - mag iistop once makita ung pickup
//
//
//        System.out.println("\nTraversing an ArrayList using for-each loop: ");
//        for (String car : cars) {
//            System.out.println(car);
//        }

        // Simpler for-each loop
        cars.forEach(System.out::println);


    }
}
