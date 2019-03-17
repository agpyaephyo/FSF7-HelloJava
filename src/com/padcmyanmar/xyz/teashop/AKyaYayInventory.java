package com.padcmyanmar.xyz.teashop;

public class AKyaYayInventory extends Inventory {

    private static final int AKYAYAY_PSC = 1000;
    private static final String AKYAYAY_PCU = "kettle";
    private static final String AKYAYAY_ISU = "milliliter";
    private static final String AKYAYAY_INVENTORY_TYPE = "AKyaYay";

    public AKyaYayInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * AKYAYAY_PSC,
                AKYAYAY_PCU, AKYAYAY_ISU,
                AKYAYAY_PSC,
                AKYAYAY_INVENTORY_TYPE);
    }

    public void updateInventoryForNewSale(Tea tea, int sellingQuantity){
        inStockQuantity -= tea.getaKyaYayAmount() * sellingQuantity;
    }
}
