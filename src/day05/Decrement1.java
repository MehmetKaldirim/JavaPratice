package day05;

import java.util.Scanner;

public class Decrement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            System.out.print(" " + --number);
        }
    }
}


