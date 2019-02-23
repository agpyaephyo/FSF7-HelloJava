package com.padcmyanmar.xyz;

public class HelloUserInput {
    public static void main(String[] args) {
        System.out.println("com.padcmyanmar.xyz.HelloUserInput");

        String myName = "Aung Pyae Phyo";
        System.out.println("myName : " + myName);

        if (args.length > 0) {
            System.out.println("args[0] : " + args[0]);
        }

        if (args.length > 1) {
            System.out.println("args[1] : " + args[1]);
            int userInput = Integer.parseInt(args[1]);
        }

        if (args.length > 2) {
            double userInput3 = Double.parseDouble(args[2]);
        }
    }
}
