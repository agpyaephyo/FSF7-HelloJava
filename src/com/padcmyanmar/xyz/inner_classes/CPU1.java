package com.padcmyanmar.xyz.inner_classes;

public class CPU1 {

    private double priceInDollar;

    class ArithmeticLogicUnit {
        private double noOfCores;

        double getNoOfCores() {
            return 8;
        }
    }

    protected class L3Cache {
        private double sizeInKB;

        public double getSizeInKB() {
            return 1024;
        }
    }
}
