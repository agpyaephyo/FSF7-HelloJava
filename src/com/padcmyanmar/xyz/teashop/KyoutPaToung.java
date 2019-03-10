package com.padcmyanmar.xyz.teashop;

public class KyoutPaToung extends Tea {

    private static final int KYOUT_PA_TOUNG_DIARY_CREAMER_AMOUNT = 4;
    private static final int KYOUT_PA_TOUNG_AKYAYAY_AMOUNT = 50;
    private static final int KYOUT_PA_TOUNG_SUGAR_AMOUNT = 4;

    public KyoutPaToung(SellingType sellingType) {
        super(sellingType,
                KYOUT_PA_TOUNG_DIARY_CREAMER_AMOUNT,
                KYOUT_PA_TOUNG_AKYAYAY_AMOUNT,
                KYOUT_PA_TOUNG_SUGAR_AMOUNT);
    }
}
