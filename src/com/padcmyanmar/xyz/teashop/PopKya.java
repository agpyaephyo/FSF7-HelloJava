package com.padcmyanmar.xyz.teashop;

public class PopKya extends Tea {

    private static final int POP_KYA_DIARY_CREAMER_AMOUNT = 1;
    private static final int POP_KYA_AKYAYAY_AMOUNT = 60;
    private static final int POP_KYA_SUGAR_AMOUNT = 1;

    public PopKya(SellingType sellingType) {
        super(sellingType,
                POP_KYA_DIARY_CREAMER_AMOUNT,
                POP_KYA_AKYAYAY_AMOUNT,
                POP_KYA_SUGAR_AMOUNT);
    }
}
