package com.padcmyanmar.xyz.teashop;

public class Inventory {

    private int purchasingQuantity;
    protected double inStockQuantity;
    private String purchasingUnit;
    private String instockUnit;
    private int purchasingSellingConversion;
    private String inventoryType;

    public Inventory(int purchasingQuantity, double inStockQuantity,
                     String purchasingUnit, String instockUnit,
                     int purchasingSellingConversion, String inventoryType) {
        this.purchasingQuantity = purchasingQuantity;
        this.inStockQuantity = inStockQuantity;
        this.purchasingUnit = purchasingUnit;
        this.instockUnit = instockUnit;
        this.purchasingSellingConversion = purchasingSellingConversion;
        this.inventoryType = inventoryType;
    }

    public double getInStockQuantity() {
        return inStockQuantity;
    }

    private double getRemainingInstockQuantity() {
        return inStockQuantity / purchasingSellingConversion;
    }

    public double getUsedStockQuantity() {
        return (purchasingQuantity * purchasingSellingConversion) - inStockQuantity;
    }

    public void showRemainingStock() {
        System.out.println(inventoryType + " : " + getRemainingInstockQuantity());
    }

    public void showUsedStock() {
        System.out.println(inventoryType + " : " + getUsedStockQuantity() / purchasingSellingConversion);
    }

    public int getPurchasingQuantity() {
        return purchasingQuantity;
    }

    public int getPurchasingSellingConversion() {
        return purchasingSellingConversion;
    }
}
