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
        System.out.println("Sale Summary");
        double totalPrice = 0.0;
        for (SaleItem saleItem : saleItems) {
            double subTotal = saleItem.getQuantity() * saleItem.getFruitType().getPrice();
            System.out.println(saleItem.getFruitType().getName()
                    + " (" + saleItem.getFruitType().getPrice() + " mmk for "
                    + saleItem.getFruitType().getSaleUnit() + ") : " + saleItem.getQuantity()
                    + " - " + subTotal + " mmk");

            totalPrice += subTotal;
        }
        System.out.println("Total : " + totalPrice + " mmk");
    }
}
