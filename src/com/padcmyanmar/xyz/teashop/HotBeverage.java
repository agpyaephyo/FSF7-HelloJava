package com.padcmyanmar.xyz.teashop;

public abstract class HotBeverage {

    private SellingType sellingType;
    private String name;

    public HotBeverage(String name, SellingType sellingType) {
        this.sellingType = sellingType;
        this.name = name;
    }

    public SellingType getSellingType() {
        return sellingType;
    }

    public String getName() {
        return name;
    }

    public abstract boolean isSufficientInStockForNewSale(int quantity);
}
