package com.padcmyanmar.xyz.teashop;

public class SellingType {

    private double price;
    private String name;

    public SellingType(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
