package com.padcmyanmar.xyz.teashop;

public class PopSaint extends Tea {

    private static final int POP_SAINT_DIARY_CREAMER_AMOUNT = 1;
    private static final int POP_SAINT_AKYAYAY_AMOUNT = 50;
    private static final int POP_SAINT_SUGAR_AMOUNT = 2;

    public PopSaint(SellingType sellingType) {
        super(sellingType,
                POP_SAINT_DIARY_CREAMER_AMOUNT,
                POP_SAINT_AKYAYAY_AMOUNT,
                POP_SAINT_SUGAR_AMOUNT);
    }
}
