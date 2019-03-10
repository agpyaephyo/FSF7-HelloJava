package com.padcmyanmar.xyz.teashop;

public class Tea extends HotBeverage {

    private double dairyCreamerAmount;
    private int aKyaYayAmount;
    private double sugerAmount;

    public Tea(SellingType sellingType, double dairyCreamerAmount,
               int aKyaYayAmount, double sugerAmount) {
        super(sellingType);
        this.dairyCreamerAmount = dairyCreamerAmount;
        this.aKyaYayAmount = aKyaYayAmount;
        this.sugerAmount = sugerAmount;
    }
}
