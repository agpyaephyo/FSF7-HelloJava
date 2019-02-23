package com.padcmyanmar.xyz.fruit_sale;

public class SaleItem {

    private double quantity;
    private FruitType fruitType;

    public SaleItem(double quantity, FruitType fruitType) {
        this.quantity = quantity;
        this.fruitType = fruitType;
    }

    public double getQuantity() {
        return quantity;
    }

    public FruitType getFruitType() {
        return fruitType;
    }
}
