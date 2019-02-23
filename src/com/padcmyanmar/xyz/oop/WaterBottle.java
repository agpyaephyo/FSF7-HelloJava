package com.padcmyanmar.xyz.oop;

public class WaterBottle {

    public int heightInInches;
    private String color;
    private float waterLevelInMilliLeter;
    private boolean isBottleOpen;

    final static int MAX_WATER = 150;

    public WaterBottle(String color) {
        waterLevelInMilliLeter = 100;
        this.color = color;
    }

    /**
     *
     * @param isBottleOpen
     */
    public void setBottleOpen(boolean isBottleOpen) {
        this.isBottleOpen = isBottleOpen;
    }

    /**
     * ရေဖြည့်ပေးမှာ
     */
    public void fillUpWater(float waterLevelInMilliLeter) {
        this.waterLevelInMilliLeter += waterLevelInMilliLeter;
    }

    public void fillUpWater() {
        float waterLevelToFillUp = MAX_WATER - this.waterLevelInMilliLeter;
        this.waterLevelInMilliLeter += waterLevelToFillUp;
    }

    /**
     * ရေဗူးထဲက ရေပမာဏကို ပြန်ပေးမှာ
     */
    public float getWaterLevelInMilliLeter() {
        return waterLevelInMilliLeter;
    }

    /**
     * ရေကို ထုတ်ဖို့
     */
    public void removeWater(float waterToRemove) {
        this.waterLevelInMilliLeter -= waterToRemove;
    }

    public void removeWater() {
        this.waterLevelInMilliLeter = 0.0f;
    }

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
