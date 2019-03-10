package com.padcmyanmar.xyz.teashop;

public class ChoKya extends Tea {

    private static final int CHO_KYA_DIARY_CREAMER_AMOUNT = 3;
    private static final int CHO_KYA_AKYAYAY_AMOUNT = 60;
    private static final int CHO_KYA_SUGAR_AMOUNT = 1;

    public ChoKya(SellingType sellingType) {
        super(sellingType,
                CHO_KYA_DIARY_CREAMER_AMOUNT,
                CHO_KYA_AKYAYAY_AMOUNT,
                CHO_KYA_SUGAR_AMOUNT);
    }
}
