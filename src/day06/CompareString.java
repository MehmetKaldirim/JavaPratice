package day06;
import java.util.ArrayList;
import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
//Write a program that reads two lines and compares them without whitespaces.
// The program should print true if both lines are equal, otherwise – false.

            Scanner scanner = new Scanner(System.in);
            // start coding here
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();
            s1 = s1.replace(" ", "");
            s2 = s2.replace(" ", "");
            System.out.println(s1.equals(s2));
        }
    }
