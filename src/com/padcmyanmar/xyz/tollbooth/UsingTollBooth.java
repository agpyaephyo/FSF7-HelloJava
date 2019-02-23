package com.padcmyanmar.xyz.tollbooth;

import java.util.Scanner;

public class UsingTollBooth {

    public static void main(String[] args) {
        System.out.println("==== Starting for Feb 10th ====");
        Scanner scanner = new Scanner(System.in);
        TollBooth tollBooth = new TollBooth();

        char userInput;
        do {
            System.out.print("Input Car Type (1, 2, 3, 4) - “E” for End-Of-Duty : ");
            userInput = scanner.next().charAt(0);
            if (userInput == 'E') {
                tollBooth.showEndOfDutySummary();
            } else {
                tollBooth.increaseTotalAmountByCarType(userInput);
            }
        } while (userInput != 'E');
    }
}
