package com.padcmyanmar.xyz.fruit_sale;

public class FruitType {

    private String saleUnit;
    private double price;
    private String name;

    public FruitType(String saleUnit, double price, String name) {
        this.saleUnit = saleUnit;
        this.price = price;
        this.name = name;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
