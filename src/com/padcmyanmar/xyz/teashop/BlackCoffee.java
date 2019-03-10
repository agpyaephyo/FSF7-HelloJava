package com.padcmyanmar.xyz.teashop;

public class BlackCoffee extends Coffee {

    private static final int BLACK_COFFEE_COFFEE_POWDER_AMOUNT = 4;
    private static final int BLACK_COFFEE_SUGAR_AMOUNT = 2;
    private static final int BLACK_COFFEE_LIME_SLICE = 1;

    private int coffeePowderAmount;
    private int sugerAmount;
    private int limeSlice;

    public BlackCoffee(SellingType sellingType) {
        super(sellingType);
        coffeePowderAmount = BLACK_COFFEE_COFFEE_POWDER_AMOUNT;
        sugerAmount = BLACK_COFFEE_SUGAR_AMOUNT;
        limeSlice = BLACK_COFFEE_LIME_SLICE;
    }
}
