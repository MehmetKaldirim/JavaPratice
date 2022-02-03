package day06;
import java.util.Scanner;
public class ChooseChef {

    /*Your program should read all the words (or numbers) from the three
    lines and output "The form for first name is completed. We will contact
    you if we need a chef who cooks cuisine preference dishes and has years
     of experience years of experience."


Sample Input 1:
Eugene
8
fusion
Sample Output 1:
The form for Eugene is completed. We will contact you if we need a chef who
 cooks fusion dishes and has 8 years of experience./*

     */
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String firstName = scanner.next();
        System.out.println("Enter year of exp");
        String exprience = scanner.next();
        System.out.println("Enter preference");
        String preference = scanner.next();
       // System.out.println("The form for " + firstName +
       // " is completed. We will contact you if we need a chef who cooks " +
       // preference + " dishes and has " + exprience + " years of experience.");
        System.out.printf("The form for %s is completed. We will contact you if we need a chef who cooks %s dishes and has %s years of experience.",firstName, preference, exprience);
    }
}

