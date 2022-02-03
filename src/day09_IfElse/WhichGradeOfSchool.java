package day09_IfElse;

import java.util.Scanner;

public class WhichGradeOfSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        System.out.println("Enter school years of Person");
        byte yearOfSchool = scanner.nextByte();

        if ( yearOfSchool>0 && yearOfSchool < 6 ){
            System.out.println("1-5:Elementary School");
        } else if ( yearOfSchool>5 && yearOfSchool < 9 ){
            System.out.println("6-8: Middle school");
        } else if ( yearOfSchool>8 && yearOfSchool < 13 ){
            System.out.println("9-12: High school");
        } else if ( yearOfSchool>12 && yearOfSchool < 17 ){
            System.out.println("13-16: College");
        } else if ( yearOfSchool>17 && yearOfSchool < 19 ){
            System.out.println("17-18: Grad School");
        } else {
            System.out.println("Invalid Number");
        }
    }
}

/*Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18    */
