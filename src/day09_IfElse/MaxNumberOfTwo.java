package day09_IfElse;

import java.util.Scanner;

public class MaxNumberOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Second Number");
        int secondNumber = sc.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println("Max Number = " + secondNumber);
        } else if (secondNumber < firstNumber) {
            System.out.println("Max Number = " + firstNumber);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
 /*   Write a program that can print the maximum number between two numbers, if both are equal then print Equal

        Ex:
        n1= 100, n2 = 200;

        output:
        200 is maximum number*/

