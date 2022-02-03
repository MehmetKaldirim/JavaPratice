package day08_If;
import java.util.Scanner;
public class Symmetric4DigitString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = scanner.next();
        if (number.charAt(0) == number.charAt(3) && number.charAt(1) == number.charAt(2)) {
        final int num = 1;
        System.out.println(num);
        } else { final int num1 = 43;
                System.out.println(num1);
        }
    }
}

/* Given a four-digit number, determine whether its decimal notation is symmetric.
 If the number is symmetric, output 1; otherwise, output any other integer.*/