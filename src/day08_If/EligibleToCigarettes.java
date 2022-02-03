package day08_If;

import java.util.Scanner;

public class EligibleToCigarettes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age of Person");
        int ageOfPerson = scanner.nextInt();
        final int min = 18;
        System.out.println(ageOfPerson >= min  ? "YES, ELIGIBLE" : "NO, NOT ELIGIBLE");
    }
}

// Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
