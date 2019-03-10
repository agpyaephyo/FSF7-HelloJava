package com.padcmyanmar.xyz.teashop;

public class KyaSaint extends Tea {

    private static final int KYA_SAINT_DIARY_CREAMER_AMOUNT = 2;
    private static final int KYA_SAINT_AKYAYAY_AMOUNT = 60;
    private static final int KYA_SAINT_SUGAR_AMOUNT = 3;

    public KyaSaint(SellingType sellingType) {
        super(sellingType,
                KYA_SAINT_DIARY_CREAMER_AMOUNT,
                KYA_SAINT_AKYAYAY_AMOUNT,
                KYA_SAINT_SUGAR_AMOUNT);
    }
}
