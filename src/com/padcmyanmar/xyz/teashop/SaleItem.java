package com.padcmyanmar.xyz.teashop;

public class SaleItem {

    private HotBeverage saleHotBeverage;
    private int saleQuantity;

    public SaleItem(HotBeverage saleHotBeverage, int saleQuantity) {
        this.saleHotBeverage = saleHotBeverage;
        this.saleQuantity = saleQuantity;
    }

    public HotBeverage getSaleHotBeverage() {
        return saleHotBeverage;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }
}
