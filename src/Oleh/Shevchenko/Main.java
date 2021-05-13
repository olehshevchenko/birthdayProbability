package Oleh.Shevchenko;

import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int DAYS_IN_YEAR = 365;


    public static void main(String[] args) {

        System.out.println("Enter how much people in the group");
        int peopleInGroup = SCANNER.nextInt();
        double value = 1;
        for (int i = DAYS_IN_YEAR - peopleInGroup; i < DAYS_IN_YEAR; i++) {
            value = value * i;
            value = value / DAYS_IN_YEAR;
        }
        double probability = (1 - value) * 100;
        System.out.println("probability of coinciding birthdays is: " + String.format("%.3f",probability) + "%");
    }
}