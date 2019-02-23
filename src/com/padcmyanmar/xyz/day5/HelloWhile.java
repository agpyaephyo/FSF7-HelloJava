package com.padcmyanmar.xyz.day5;

import java.util.Scanner;

public class HelloWhile {

    public static void main(String[] args) {
        /*
        //simple "while"
        int i = 1;
        while (i <= 10) {
            System.out.println("Line " + i);
            ++i;
        }
        */

        /*
        //another simple "while"
        int sum = 0, i = 100;
        while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
        }
        System.out.println("Sum = " + sum);
        */

        //do ... while
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        /*
        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;

            System.out.println("The current value of Sum = " + sum);
            System.out.print("\nDo you want to continue (y/n) ? : ");
            continueOrNot = input.next().charAt(0);
        } while (continueOrNot != 'n');
        */

        char continueOrNot = 'y';
        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;

            System.out.println("The current value of Sum = " + sum);
            System.out.print("\nDo you want to continue (y/n) ? : ");
            continueOrNot = input.next().charAt(0);

            if (continueOrNot != 'n') {
                break;
            }
        }
        ;

        /*
        //infinite while loop
        int j = 100;
        while (j == 100) {
            System.out.print("Hey!");
        }
        */
    }
}
