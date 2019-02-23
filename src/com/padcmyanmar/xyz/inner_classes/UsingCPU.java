package com.padcmyanmar.xyz.inner_classes;

public class UsingCPU {

    public static void main(String args[]) {
        /*
        CPU1 intelCPU = new CPU1();
        CPU1.ArithmeticLogicUnit alu = intelCPU.new ArithmeticLogicUnit();
        CPU1.L3Cache l3Cache = intelCPU.new L3Cache();

        System.out.println("ALU Cores : " + alu.getNoOfCores());
        System.out.println("L3Cache : "+l3Cache.getSizeInKB());
        */

        /*
        CPU2 ibmCPU = new CPU2(8);
        CPU2.ArithmeticLogicUnit ibmAlu = ibmCPU.new ArithmeticLogicUnit();
        CPU2.L3Cache ibmL3Cache = ibmCPU.new L3Cache();

        System.out.println("ALU Cores : " + ibmAlu.getNoOfCores());
        System.out.println("L3Cache : "+ibmL3Cache.getSizeInKB());
        */

        CPU3 chinaCPU = new CPU3(9);
        CPU3.Manufacturer chinaCPUManufacturers = new CPU3.Manufacturer();

        System.out.println("Manufacturer Name : " + chinaCPUManufacturers.getName());
        System.out.println("Type of Silicon : "+chinaCPUManufacturers.getTypeOfSilicon());
    }
}
