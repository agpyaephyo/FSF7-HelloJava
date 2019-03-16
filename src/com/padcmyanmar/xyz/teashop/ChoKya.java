package com.padcmyanmar.xyz.teashop;

public class ChoKya extends Tea {

    private static final int CHO_KYA_DIARY_CREAMER_AMOUNT = 3;
    private static final int CHO_KYA_AKYAYAY_AMOUNT = 60;
    private static final int CHO_KYA_SUGAR_AMOUNT = 1;
    private static final String CHO_KYA_NAME = "Cho Kya Tea";

    public static final char CHO_KYA_CHAR = 'C';

    private static int totalChoKyaCup;
    private static double subTotalForChoKyaSales;

    public ChoKya(SellingType sellingType) {
        super(sellingType,
                CHO_KYA_DIARY_CREAMER_AMOUNT,
                CHO_KYA_AKYAYAY_AMOUNT,
                CHO_KYA_SUGAR_AMOUNT,
                CHO_KYA_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + CHO_KYA_CHAR
                + "\' for" + CHO_KYA_NAME);
    }

    public static void addTotalChoKyaCup() {
        totalChoKyaCup++;
    }

    public static void addSubTotal(double price) {
        subTotalForChoKyaSales += price;
    }

    public static void showSubTotal() {
        System.out.println(CHO_KYA_NAME + " - " + totalChoKyaCup
                + " cups : " + subTotalForChoKyaSales + " mmk");
    }

    public static double getSubTotalForChoKyaSales() {
        return subTotalForChoKyaSales;
    }
}
