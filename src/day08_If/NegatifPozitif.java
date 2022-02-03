package day08_If;

import java.util.Scanner;

public class NegatifPozitif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int min = 0;
        System.out.println(min < number ? "YES" : "NO");
    }
}
/*Write a program that reads the number and prints YES if it is positive.
 Otherwise, the program should print NO.
Do not forget that zero is not a positive number.
*/