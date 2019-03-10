package com.padcmyanmar.xyz.teashop;

public class DairyCreamerInventory extends Inventory {

    private static final int DAIRY_CREAMER_PSC = 30;
    private static final String DAIRY_CREAMER_PCU = "tin";
    private static final String DAIRY_CREAMER_ISU = "tea-spoon";

    public DairyCreamerInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * DAIRY_CREAMER_PSC,
                DAIRY_CREAMER_PCU,
                DAIRY_CREAMER_ISU,
                DAIRY_CREAMER_PSC);
    }
}
