package coffeMachine;

import java.util.Scanner;

public class fourDivisibleMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Elemets");
        int numberOfElements = scanner.nextInt();
        int number;
        int maxFourDivisibleNum = 0;

        for (int i =1; i <= numberOfElements; i++){
            System.out.println("Enter " + i + ". number");
            number = scanner.nextInt();
            maxFourDivisibleNum = number > maxFourDivisibleNum && number % 4 == 0 ? number : maxFourDivisibleNum;
        }
        System.out.println("Maximum four divisible Number is = " + maxFourDivisibleNum);
    }
}
/// find the biggest number which is divisible 4