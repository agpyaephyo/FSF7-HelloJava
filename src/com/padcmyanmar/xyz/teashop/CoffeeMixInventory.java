package com.padcmyanmar.xyz.teashop;

public class CoffeeMixInventory extends Inventory {

    private static final int COFFEE_MIX_PSC = 8;
    private static final String COFFEE_MIX_PCU = "pack";
    private static final String COFFEE_MIX_ISU = "small pack";
    private static final String COFFEE_MIX_INVENTORY_TYPE = "Coffee Mix";

    public CoffeeMixInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * COFFEE_MIX_PSC,
                COFFEE_MIX_PCU, COFFEE_MIX_ISU,
                COFFEE_MIX_PSC,
                COFFEE_MIX_INVENTORY_TYPE);
    }
}
