package com.padcmyanmar.xyz.day4;

import java.util.Scanner;

public class HelloSwitch {

    public static void main(String[] args) {
        //simple "switch"
        int week = 3;
        String day;

        switch (week) {
            case 1:
                day = "Sunday";
                break;
            case 2:
                day = "Monday";
                break;
            case 3:
                day = "Tuesday";
            case 4:
                day = "Wednesday";
            case 5:
                day = "Thursday";
                break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }
        System.out.println(day);

        /*
        //another simple "switch"
        char operator;
        double number1, number2, result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operator (either +, -, * or /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter number1 and number2 respectively: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
        */
    }
}
