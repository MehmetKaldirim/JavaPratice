package day08_If;

import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sides of Triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean isValidTriangle = a + b > c && b + c > a && a + c > b;

        System.out.println(isValidTriangle ? "Yes" : "No");

    }
}
