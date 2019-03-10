package com.padcmyanmar.xyz.teashop;

public class ParSalKyi extends SellingType {

    private static final double PAR_SAL_KYI_PRICE = 700;
    private static final String PAR_SAL_KYI_NAME = "Par Sal Kyi";

    public static final char PAR_SAL_KYI_CHAR = 'K';

    public ParSalKyi() {
        super(PAR_SAL_KYI_PRICE, PAR_SAL_KYI_NAME);
    }

    public static void showSellingTypeChar() {
        System.out.println("\'" + PAR_SAL_KYI_CHAR + "\' for Par Sal Kyi");
    }
}
