package day05;

import java.util.Scanner;

public class StringModules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String word = scanner.next();
        int ind1 = scanner.nextInt();
        int ind2 = scanner.nextInt();

        System.out.println(word.replace('a' , 'b'));
        System.out.println(word.substring(ind1,ind2 + 1));

    }
}
/*
1-Write a program that reads a string and replaces all occurrences of the letter 'a' with the letter 'b'.

The program should print out the resulting string.

2-Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.

 Report a typo
Sample Input 1:

Java
0 2
Sample Output 1:

Jav */

