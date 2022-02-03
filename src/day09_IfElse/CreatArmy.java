package day09_IfElse;

import java.util.Scanner;

public class CreatArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the Number of Units please");
        int numOfUnit = scanner.nextInt();
        if (numOfUnit < 1){
            System.out.println("no army");
        } else if (numOfUnit >= 1 && numOfUnit <= 19){
            System.out.println("pack");
        } else if (numOfUnit >= 20 && numOfUnit <= 249){
            System.out.println("throng");
        } else if (numOfUnit >= 250 && numOfUnit <= 999){
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}
/*less than 1: no army

from 1 to 19: pack

from 20 to 249: throng

from 250 to 999: zounds

1000 and more: legion

The program should read the number of units and output the corresponding category.*/