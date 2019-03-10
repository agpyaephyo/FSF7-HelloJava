package com.padcmyanmar.xyz.teashop;

public class SineThout extends SellingType {

    private static final double SINE_THOUT_PRICE = 500;
    private static final String SINE_THOUT_NAME = "Sine Thout";

    public static final char SINE_THOUT_CHAR = 'S';

    public SineThout() {
        super(SINE_THOUT_PRICE, SINE_THOUT_NAME);
    }

    public static void showSellingTypeChar() {
        System.out.println("\'"+SINE_THOUT_CHAR+"\' for Sine Thout");
    }
}
