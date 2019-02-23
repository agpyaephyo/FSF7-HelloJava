package com.padcmyanmar.xyz.fruit_sale;

import java.util.ArrayList;

public class FruitSale {

    private ArrayList<SaleItem> saleItems;

    public FruitSale() {
        saleItems = new ArrayList<>();
    }

    public void addSaleItem(int quantity, FruitType fruitType) {
        SaleItem newSaleItem = new SaleItem(quantity, fruitType);
        saleItems.add(newSaleItem);
    }

    public ArrayList<SaleItem> getSaleItems() {
        return saleItems;
    }

    public void showSaleSummary() {

    }
}
