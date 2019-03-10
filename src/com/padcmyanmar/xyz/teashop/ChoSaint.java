package com.padcmyanmar.xyz.teashop;

public class ChoSaint extends Tea {

    private static final int CHO_SAINT_DIARY_CREAMER_AMOUNT = 3;
    private static final int CHO_SAINT_AKYAYAY_AMOUNT = 40;
    private static final int CHO_SAINT_SUGAR_AMOUNT = 3;

    public ChoSaint(SellingType sellingType) {
        super(sellingType,
                CHO_SAINT_DIARY_CREAMER_AMOUNT,
                CHO_SAINT_AKYAYAY_AMOUNT,
                CHO_SAINT_SUGAR_AMOUNT);
    }
}
