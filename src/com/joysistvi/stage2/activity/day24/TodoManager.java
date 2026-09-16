package com.joysistvi.stage2.activity.day24;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        boolean returnMenu = true;

        ArrayList<String> tasks = new ArrayList<>();

        while (returnMenu) {

//            tasks.add("Eat a Breakfast");
//            tasks.add("Log in on BSRS");
//            tasks.add("Do an Asynchronous Activity");
//            tasks.add("Attend Google Meet");
//            tasks.add("Do an Activity");
//            tasks.add("Log out on BSRS");

            System.out.println("\n=== Menu System ===");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");

            System.out.print("\nEnter choice: ");
            int userInput = input.nextInt();
            input.nextLine();

            switch (userInput) {

                case 1:
                    System.out.print("Enter a task: ");
                    String addTask = input.nextLine();

                    tasks.add(addTask);

                    System.out.println("Task added\n");
                    break;

                case 2:
                    System.out.println("\nAll task");

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++)
                            System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Enter the number you want to update: ");
                    int index = input.nextInt();
                    input.nextLine();

                    index = index -1;

                    if (index >= 0 && index < tasks.size()) {

                        System.out.print("Enter the new task: ");
                        String updatedTask = input.nextLine();

                        tasks.set(index, updatedTask);

                        System.out.println("Task Updated");
                    } else {
                        System.out.println("Invalid Input");
                    }

                    break;

                case 4:
                    System.out.print("Enter the number you want to remove: ");
                    int remove = input.nextInt();
                    input.nextLine();

                    remove = remove - 1;

                    if (remove >= 0 && remove < tasks.size()) {

                        tasks.remove(remove);

                        System.out.println("Task Removed");
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;

                case 5:
                    System.out.println("Cleared all tasks");
                    tasks.clear();
                    break;

                case 0:
                    System.out.println("You Selected Exit");
                    returnMenu = false;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        }

        input.close();
    }

}
