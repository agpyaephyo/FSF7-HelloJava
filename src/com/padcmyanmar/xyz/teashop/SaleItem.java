package com.padcmyanmar.xyz.teashop;

public class SaleItem {

    private Tea saleTea;
    private int saleQuantity;

    public SaleItem(Tea saleTea, int saleQuantity) {
        this.saleTea = saleTea;
        this.saleQuantity = saleQuantity;
    }

    public Tea getSaleTea() {
        return saleTea;
    }

    public int getSaleQuantity() {
        return saleQuantity;
    }
}
