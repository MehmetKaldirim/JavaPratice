package day11_SwitchAndScanner;

import java.util.Scanner;

public class NameOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        System.out.println("Enter the number of day");
        int numOfDay = sc.nextInt();

        switch (numOfDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Teusday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Freiday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unvalid number");
        }
    }
}
