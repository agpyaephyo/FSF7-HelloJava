package com.padcmyanmar.xyz.fruit_sale;

import java.util.ArrayList;

public class UsingFruitSale {

    public static void main(String [] args) {

        ArrayList<FruitSale> todayFruitSales = new ArrayList<>();

        int totalCountPapaya = 0, totalCountWaterMelon = 0;
        for(FruitSale fruitSale : todayFruitSales) {
            for(SaleItem saleItem : fruitSale.getSaleItems()) {
                if(saleItem.getFruitType().getName().equals("Papaya")) {
                    totalCountPapaya += saleItem.getQuantity();
                }
            }
        }
    }
}
