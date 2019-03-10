package com.padcmyanmar.xyz.teashop;

public class CoffeeHnutPhyaw extends Coffee {

    private static final int COFFEE_HNUT_PHYAW_DAIRY_CREAMER_AMOUNT = 2;
    private static final int COFFEE_HNUT_PHYAW_COFFEE_POWDER_AMOUNT = 3;
    private static final int COFFEE_HNUT_PHYAW_SUGAR_AMOUNT = 3;

    private int dairyCreamerAmount;
    private int coffeePowderAmount;
    private int sugerAmount;

    public CoffeeHnutPhyaw(SellingType sellingType) {
        super(sellingType);
        dairyCreamerAmount = COFFEE_HNUT_PHYAW_DAIRY_CREAMER_AMOUNT;
        coffeePowderAmount = COFFEE_HNUT_PHYAW_COFFEE_POWDER_AMOUNT;
        sugerAmount = COFFEE_HNUT_PHYAW_SUGAR_AMOUNT;
    }
}
