package com.padcmyanmar.xyz.teashop;

public class SugarInventory extends Inventory {

    private static final int SUGER_PSC = 350;
    private static final String SUGER_PCU = "pack";
    private static final String SUGER_ISU = "tea-spoon";

    public SugarInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * SUGER_PSC,
                SUGER_PCU, SUGER_ISU,
                SUGER_PSC);
    }

    public void updateInventoryForNewSale(Tea tea, int sellingQuantity) {
        inStockQuantity -= tea.getSugarAmount() * sellingQuantity;
    }
}
