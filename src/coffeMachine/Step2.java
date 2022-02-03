package coffeMachine;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int waterPerCoffee = 200;
        final int milkPerCoffee = 50;
        final int beansPerCoffe = 15;

        System.out.println("Write how many ml of water the coffee machine has: ");
        int amountOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int amountOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int amountOfBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int needOfCupsOfCoffee = scanner.nextInt();

        int quantityOfWater = amountOfWater / waterPerCoffee;
        int quantityOfMilk = amountOfMilk / milkPerCoffee;
        int quantityOfBeans = amountOfBeans / beansPerCoffe;

        int weCanDo = Math.min(amountOfWater / waterPerCoffee,Math.min(amountOfMilk / milkPerCoffee,amountOfBeans / beansPerCoffe));
        /*if (quantityOfWater <= quantityOfMilk && quantityOfWater <= quantityOfBeans) {
            weCanDo = quantityOfWater;
        } else if (quantityOfMilk <= quantityOfBeans && quantityOfMilk <= quantityOfWater) {
            weCanDo = quantityOfMilk;
        } else {
            weCanDo = quantityOfBeans;
        }
        ----------------------
        int count = 0;

        while (water >= 200 && milk >= 50 && coffeeBeans >= 15) {
            water -= 200;
            milk -= 50;
            coffeeBeans -= 15;
            count++;
           ---
           int cupsPossible = Math.min(waterStock/water4OneCup, Math.min(milkStock/milk4OneCup, beansStock/coffeeBeans4OneCup));
           ---
           System.out.println((maxCups > cups) ? String.format("Yes, I can make that amount of coffee (and even %d more than that",
                maxCups - cups) : (maxCups == cups) ? "Yes, I can make that amount of coffee" :
                String.format("No, I can make only %d cup(s) of coffee", maxCups));
        }*/

            System.out.println( weCanDo < needOfCupsOfCoffee ? "No, I can make only " + weCanDo + " cup(s) of coffee" :
            weCanDo > needOfCupsOfCoffee ? "Yes, I can make that amount of coffee (and even "+ (weCanDo-needOfCupsOfCoffee) + " more than that)" :
                    "Yes, I can make that amount of coffee" );
        }
    }



/*Write how many ml of water the coffee machine has:
> 300
Write how many ml of milk the coffee machine has:
> 65
Write how many grams of coffee beans the coffee machine has:
> 100
Write how many cups of coffee you will need:
> 1
Yes, I can make that amount of coffee*/
