package com.joysistvi.stage2.discussion.day23;

public class View {

    // Declare enum inside the class
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // access an element from an enum
//        System.out.println(Level.HIGH);
//        System.out.println(Day.MONDAY);

        // Enum in conditional operations

        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY:
                System.out.println(Day.MONDAY);
                break;
            case TUESDAY:
                System.out.println(Day.TUESDAY);
                break;
            case WEDNESDAY:
                System.out.println(Day.WEDNESDAY);
                break;
            case THURSDAY:
                System.out.println(Day.THURSDAY);
                break;
            case FRIDAY:
                System.out.println(Day.FRIDAY);
                break;
            case SATURDAY:
                System.out.println(Day.SATURDAY);
                break;
            case SUNDAY:
                System.out.println(Day.SUNDAY);
                break;

        }

        if (Day.MONDAY.equals(Day.MONDAY)) {
            System.out.println("First Day of the Week");
        }

        System.out.println("\nPrinting all the days");
        // Loop thru an enum
        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }


}
