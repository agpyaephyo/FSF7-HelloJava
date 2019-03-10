package com.padcmyanmar.xyz.teashop;

public class AKyaYayInventory extends Inventory {

    private static final int AKAYYAY_PSC = 1000;
    private static final String AKAYYAY_PCU = "kettle";
    private static final String AKAYYAY_ISU = "milliliter";

    public AKyaYayInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * AKAYYAY_PSC,
                AKAYYAY_PCU, AKAYYAY_ISU,
                AKAYYAY_PSC);
    }
}
