package com.padcmyanmar.xyz.day5;

import java.util.Scanner;

public class HelloBreak {

    public static void main(String[] args) {

        /*
        //break from "for" loop
        for (int i = 1; i <= 10; ++i) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        */

        //break from "while" loop
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        Double.parseDouble("4.5");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number < 0.0) {
                break;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);

        /*
        //labeled "break"
        first:
        for (int i = 1; i < 5; i++) {

            second:
            for (int j = 1; j < 3; j++) {
                System.out.println("i = " + i + "; j = " + j);

                if (i == 2)
                    break first;
            }
            //a
        }
        //b
        */
    }
}
