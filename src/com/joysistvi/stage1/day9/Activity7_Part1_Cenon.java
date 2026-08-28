package com.joysistvi.stage1.day9;

import java.util.Scanner;

public class Activity7_Part1_Cenon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String again = "";

        do {
            System.out.print("Multiplication Table of: ");
            int table = scanner.nextInt();
            scanner.nextLine();

            if (table == 1) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 1; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 2) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 2; j <= 2; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 3) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 3; j <= 3; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 4) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 4; j <= 4; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 5) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 5; j <= 5; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 6) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 6; j <= 6; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 7) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 7; j <= 7; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 8) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 8; j <= 8; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 9) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 9; j <= 9; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else if (table == 10) {
                for (int i = 1; i <= 10; i++) {
                    for (int j = 10; j <= 10; j++) {
                        int product = i * j;
                        System.out.println(i + " * " + j + " = " + product);
                    }
                }

            } else  {
                System.out.println("Invalid Input! Please Try Again.");
            }

            System.out.print("\nOpen another table? (y/n)");
            again = scanner.nextLine();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Program ended");

    }
}
