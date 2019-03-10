package com.padcmyanmar.xyz.teashop;

public class SugerInventory extends Inventory {

    private static final int SUGER_PSC = 350;
    private static final String SUGER_PCU = "pack";
    private static final String SUGER_ISU = "tea-spoon";

    public SugerInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * SUGER_PSC,
                SUGER_PCU, SUGER_ISU,
                SUGER_PSC);
    }
}
