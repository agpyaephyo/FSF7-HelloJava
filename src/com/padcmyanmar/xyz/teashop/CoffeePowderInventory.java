package com.padcmyanmar.xyz.teashop;

public class CoffeePowderInventory extends Inventory {

    private static final int COFFEE_POWDER_PSC = 75;
    private static final String COFFEE_POWDER_PCU = "pack";
    private static final String COFFEE_POWDER_ISU = "tea-spoon";
    private static final String COFFEE_POWDER_INVENTORY_TYPE = "Coffee Powder";

    public CoffeePowderInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * COFFEE_POWDER_PSC,
                COFFEE_POWDER_PCU, COFFEE_POWDER_ISU,
                COFFEE_POWDER_PSC,
                COFFEE_POWDER_INVENTORY_TYPE);
    }
}
