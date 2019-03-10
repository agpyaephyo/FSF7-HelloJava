package com.padcmyanmar.xyz.teashop;

public class Inventory {

    private int purchasingQuantity;
    protected double inStockQuantity;
    private String purchasingUnit;
    private String instockUnit;
    private int purchasingSellingConversion;

    public Inventory(int purchasingQuantity, double inStockQuantity,
                     String purchasingUnit, String instockUnit,
                     int purchasingSellingConversion) {
        this.purchasingQuantity = purchasingQuantity;
        this.inStockQuantity = inStockQuantity;
        this.purchasingUnit = purchasingUnit;
        this.instockUnit = instockUnit;
        this.purchasingSellingConversion = purchasingSellingConversion;
    }

    public double getInStockQuantity() {
        return inStockQuantity;
    }
}
