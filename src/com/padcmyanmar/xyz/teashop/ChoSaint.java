package com.padcmyanmar.xyz.teashop;

public class ChoSaint extends Tea {

    private static final int CHO_SAINT_DIARY_CREAMER_AMOUNT = 3;
    private static final int CHO_SAINT_AKYAYAY_AMOUNT = 40;
    private static final int CHO_SAINT_SUGAR_AMOUNT = 3;
    private static final String CHO_SAINT_NAME = "Cho Saint Tea";

    public static final char CHO_SAINT_CHAR = 'S';

    private static int totalChoSaintCups;
    private static double subTotalForChoSaintSales;

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

    public static void setTotalChoSaintCups(int totalChoSaintCups) {
        if (totalChoSaintCups > 0) {
            ChoSaint.totalChoSaintCups = totalChoSaintCups;
        }
    }

    public static void addTotalChoSaintCups(int quantity) {
        totalChoSaintCups += quantity;
    }

    public static void addSubTotal(double price) {
        subTotalForChoSaintSales += price;
    }

    public static void showSubTotal() {
        System.out.println(CHO_SAINT_NAME + " - " + totalChoSaintCups
                + " cups : " + subTotalForChoSaintSales + " mmk");
    }

    public static double getSubTotalForChoSaintSales() {
        return subTotalForChoSaintSales;
    }
}
