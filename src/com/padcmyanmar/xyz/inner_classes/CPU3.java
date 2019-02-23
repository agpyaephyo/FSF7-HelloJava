package com.padcmyanmar.xyz.inner_classes;

public class CPU3 {

    private double priceInDollar;
    private int generation;

    public CPU3(int generation) {
        this.generation = generation;
    }

    class ArithmeticLogicUnit {
        private double noOfCores;

        double getNoOfCores() {
            return 8;
        }
    }

    protected class L3Cache {
        private double sizeInKB;

        public double getSizeInKB() {
            if (CPU3.this.generation <= 3) {
                return 128;
            } else if (CPU3.this.generation <= 5) {
                return 256;
            } else {
                return 512;
            }
        }
    }

    static class Manufacturer {
        private String name;
        private String typeOfSilicon;

        public String getName() {
            return "Zetrica";
        }

        public String getTypeOfSilicon() {
            return "PMP34";
        }
    }
}
