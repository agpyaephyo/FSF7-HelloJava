package com.padcmyanmar.xyz.teashop;

public class Inventory {

    private int purchasingQuantity;
    private double instockQuantity;
    private String purchasingUnit;
    private String instockUnit;
    private int purchasingSellingConversion;

    public Inventory(int purchasingQuantity, double instockQuantity,
                     String purchasingUnit, String instockUnit,
                     int purchasingSellingConversion) {
        this.purchasingQuantity = purchasingQuantity;
        this.instockQuantity = instockQuantity;
        this.purchasingUnit = purchasingUnit;
        this.instockUnit = instockUnit;
        this.purchasingSellingConversion = purchasingSellingConversion;
    }
}
