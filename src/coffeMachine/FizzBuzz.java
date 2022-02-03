package coffeMachine;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginOfInt = scanner.nextInt();
        int endOfInt = scanner.nextInt();

        for (int a = beginOfInt;a <= endOfInt; a++){
            System.out.println( a % 3 ==0 && a % 5 == 0 ? "FizzBuzz" :
                    a % 3 ==0 ? "Fizz" :
                    a % 5 == 0 ? "Buzz" : a);
        }
    }
}
// Classic fizz buzz question for programmer