package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class NameOfMonthsWithTernaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of months please");
        int n = sc.nextInt();

        System.out.println((n >= 1 && n <= 12) ? (n == 1) ? "Jan" : (n == 2) ? "Feb" :
                (n == 3) ? "Mar" : (n == 4) ? "April" : (n == 5) ? "May" : (n == 6) ? "Jun" :
                (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sep" : (n == 10) ? "Oct" :
                (n == 11) ? "Nov" : "Dec" : "Invalid number for months of year");
    }
}