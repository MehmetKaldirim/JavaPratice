package day11_SwitchAndScanner;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();

        switch (item) {
            case "Blanket":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 40 + "$");
                break;
            case "Charger":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 75 + "$");
                break;
            case "Hat":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 75 + "$");
                break;
            case "Headphones":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 70 + "$");
                break;
            case "Laptop":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "Pants":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 50 + "$");
                break;
            case "Pillow":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 60 + "$");
                break;
            case "Smartphone":
                System.out.println("Sorry, not enough funds on your gift card!");
                break;
            case "USB cable":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 90 + "$");
                break;

            case "Socks":
                System.out.println("Thank you for your purchase! ");
                System.out.println("Your current balance is: " + 95 + "$");
                break;


            default:
                System.out.println("Invalid item!");

        }
    }

}