package day08_If;

import java.util.Scanner;

public class Symmetric4DigitInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int a = 1000;
        final int b = 100;
        final int c = 10;
        boolean firstLastNumberEquality = number / a == number % c;
        boolean secondThirdNumberEquality = number / b % c == number % b / c;
        if (firstLastNumberEquality && secondThirdNumberEquality) {
            final int num = 1;
            System.out.println(num);
        } else {
            final int num1 = 43;
            System.out.println(num1);
        }
    }
}
/* Given a four-digit number, determine whether its decimal notation is symmetric.
If the number is symmetric, output 1; otherwise, output any other integer.*/