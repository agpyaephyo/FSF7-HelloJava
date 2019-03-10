package com.padcmyanmar.xyz.teashop;

public class SineThoutParSal extends SellingType {

    private static final double SINE_THOUT_PAR_SAL_PRICE = 600;

    public static final char SINE_THOUT_PAR_SAL_CHAR = 'P';
    private static final String SINE_THOUT_PAR_SAL_NAME = "Sine Thout Par Sal";

    public SineThoutParSal() {
        super(SINE_THOUT_PAR_SAL_PRICE, SINE_THOUT_PAR_SAL_NAME);
    }

    public static void showSellingTypeChar() {
        System.out.println("\'"+SINE_THOUT_PAR_SAL_CHAR+"\' for Sine Thout Par Sal");
    }
}
