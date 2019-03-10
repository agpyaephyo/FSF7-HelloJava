package com.padcmyanmar.xyz.teashop;

public class PopSaint extends Tea {

    private static final int POP_SAINT_DIARY_CREAMER_AMOUNT = 1;
    private static final int POP_SAINT_AKYAYAY_AMOUNT = 50;
    private static final int POP_SAINT_SUGAR_AMOUNT = 2;

    public static final int POP_SAINT_CHAR = 'A';
    public static final String POP_SAINT_NAME = "Pop Saint Tea";

    public PopSaint(SellingType sellingType) {
        super(sellingType,
                POP_SAINT_DIARY_CREAMER_AMOUNT,
                POP_SAINT_AKYAYAY_AMOUNT,
                POP_SAINT_SUGAR_AMOUNT,
                POP_SAINT_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + POP_SAINT_CHAR + "\' for " + POP_SAINT_NAME);
    }
}
