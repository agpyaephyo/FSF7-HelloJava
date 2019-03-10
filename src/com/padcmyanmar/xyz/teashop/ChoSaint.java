package com.padcmyanmar.xyz.teashop;

public class ChoSaint extends Tea {

    private static final int CHO_SAINT_DIARY_CREAMER_AMOUNT = 3;
    private static final int CHO_SAINT_AKYAYAY_AMOUNT = 40;
    private static final int CHO_SAINT_SUGAR_AMOUNT = 3;
    private static final String CHO_SAINT_NAME = "Cho Saint Tea";

    public static final char CHO_SAINT_CHAR = 'S';

    public ChoSaint(SellingType sellingType) {
        super(sellingType,
                CHO_SAINT_DIARY_CREAMER_AMOUNT,
                CHO_SAINT_AKYAYAY_AMOUNT,
                CHO_SAINT_SUGAR_AMOUNT,
                CHO_SAINT_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + CHO_SAINT_CHAR
                + "\' for " + CHO_SAINT_NAME);
    }
}
