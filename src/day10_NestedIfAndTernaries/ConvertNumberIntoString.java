package day10_NestedIfAndTernaries;

import java.util.Scanner;

public class ConvertNumberIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1-10 ");
        int n = sc.nextInt();

        System.out.println((n >= 1 && n <= 10) ? (n == 1) ? "One" : (n == 2) ? "Two" :
                (n == 3) ? "Three" : (n == 4) ? "Four" : (n == 5) ? "Five" :
                (n == 6) ? "Six" : (n == 7) ? "Seven" : (n == 8) ? "Eight" :
                (n == 9) ? "Nine" : "Ten" : "Out of Boundry");
    }
}

/*Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One*/