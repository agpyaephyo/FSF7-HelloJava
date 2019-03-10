package com.padcmyanmar.xyz.teashop;

public class CoffeeMix extends Coffee {

    private static final double COFFEE_MIX_DAIRY_CREAMER_AMOUNT = 0.5;
    private static final int COFFEE_MIX_AMOUNT = 1;

    private static final char COFFEE_MIX_CHAR = 'M';

    private double dairyCreamerAmount;
    private int coffeeMixAmount;

    public CoffeeMix(SellingType sellingType) {
        super(sellingType);
        dairyCreamerAmount = COFFEE_MIX_DAIRY_CREAMER_AMOUNT;
        coffeeMixAmount = COFFEE_MIX_AMOUNT;
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + COFFEE_MIX_CHAR + "\' for Coffee Mix");
    }
}
