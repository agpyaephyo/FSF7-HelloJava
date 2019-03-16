package com.padcmyanmar.xyz.teashop;

public class KyoutPaToung extends Tea {

    private static final int KYOUT_PA_TOUNG_DIARY_CREAMER_AMOUNT = 4;
    private static final int KYOUT_PA_TOUNG_AKYAYAY_AMOUNT = 50;
    private static final int KYOUT_PA_TOUNG_SUGAR_AMOUNT = 4;

    public static final char KYOUT_PA_TOUNG_CHAR = 'P';
    private static final String KYOUT_PA_TOUNG_NAME = "Kyout Pa Toung Tea";

    private static int totalKyoutPaToungCups;
    private static double subTotalForKyoutPaToungSale = 0.0;

    public KyoutPaToung(SellingType sellingType) {
        super(sellingType,
                KYOUT_PA_TOUNG_DIARY_CREAMER_AMOUNT,
                KYOUT_PA_TOUNG_AKYAYAY_AMOUNT,
                KYOUT_PA_TOUNG_SUGAR_AMOUNT,
                KYOUT_PA_TOUNG_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + KYOUT_PA_TOUNG_CHAR + "\' for " +
                KYOUT_PA_TOUNG_NAME);
    }

    public static void addTotalKyoutPaToungCups() {
        totalKyoutPaToungCups++;
    }

    public static void addSubTotal(double price) {
        subTotalForKyoutPaToungSale += price;
    }

    public static void showSubTotal() {
        System.out.println(KYOUT_PA_TOUNG_NAME + " - " + totalKyoutPaToungCups
                + " cups : " + subTotalForKyoutPaToungSale + " mmk");
    }

    public static double getSubTotalForKyoutPaToungSale() {
        return subTotalForKyoutPaToungSale;
    }
}
