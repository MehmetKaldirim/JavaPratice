package day05;

import java.util.Scanner;

public class Decrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        System.out.println("enter 4 number please");
        int  num1 = scanner.nextInt();
        int  num2 = scanner.nextInt();
        int  num3 = scanner.nextInt();
        int  num4 = scanner.nextInt();
        //System.out.println("The numbers after decreasing 1 are ");

        System.out.printf("The numbers after decreasing 1 are %d %d %d %d", --num1, --num2, --num3, --num4);
    }
}
