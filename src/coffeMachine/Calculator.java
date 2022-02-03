package coffeMachine;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        System.out.println("Enter first number");
        long firstNumber = scanner.nextLong();
        System.out.println("Enter operator");
        String operator = scanner.next();
        System.out.println("Enter second number");
        long secondNumber = scanner.nextLong();
        switch (operator) {
            case "+" : System.out.println("a + b = " + (firstNumber + secondNumber));break;
            case "-" : System.out.println("a - b = " + (firstNumber - secondNumber));break;
            case "/" : System.out.println("a / b = " + firstNumber / secondNumber);break;
            case "*" : System.out.println("a * b = " + firstNumber * secondNumber);break;
            default : System.out.println("Unknown operator");
        }
    }
}

// Calculator