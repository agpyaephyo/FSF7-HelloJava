package com.padcmyanmar.xyz.teashop;

public class LimeInventory extends Inventory {

    private static final int LIME_PSC = 8;
    private static final String LIME_PCU = "Lone";
    private static final String LIME_ISU = "Sate";
    private static final String LIME_INVENTORY_TYPE = "Lime";

    public LimeInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * LIME_PSC,
                LIME_PCU, LIME_ISU,
                LIME_PSC,
                LIME_INVENTORY_TYPE);
    }
}
