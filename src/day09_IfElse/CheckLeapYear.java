package day09_IfElse;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int four = 4;
        final int hund = 100;
        final int foHund = 400;
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        System.out.println(year % foHund == 0 ? "Leap" :
                year % four == 0 && year % hund != 0 ? "Leap" : "Regular");
    }
}
   /* leap years are those years in which the year’s number is either divisible
    by 4, but not divisible by 100, or divisible by 400 (for example, the year
    2000 is a leap year, but the year 2100 will not be a leap year).
    The program should work correctly for the years 1900 ≤ n ≤ 3000.
    Output "Leap" (case-sensitive) if the given year is a leap year,
     and "Regular" otherwise.
    */

