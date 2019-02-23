package com.padcmyanmar.xyz.oop;

public class UsingWaterBottle {

    public static void main(String[] args) {
        WaterBottle myWaterBottle = new WaterBottle("blue");
        WaterBottle classWaterBottle = new WaterBottle("green");

        myWaterBottle.heightInInches = 10;

        myWaterBottle.fillUpWater(1200);
        myWaterBottle.fillUpWater(600);

        classWaterBottle.fillUpWater(1500);

        System.out.println("myWaterBottle : " + myWaterBottle.getWaterLevelInMilliLeter()
                + " - classWaterBottle : " + classWaterBottle.getWaterLevelInMilliLeter());
    }
}
