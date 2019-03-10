package com.padcmyanmar.xyz.teashop;

public class Tea extends HotBeverage {

    private double dairyCreamerAmount;
    private int aKyaYayAmount;
    private double sugarAmount;
    private String name;

    public Tea(SellingType sellingType, double dairyCreamerAmount,
               int aKyaYayAmount, double sugarAmount, String name) {
        super(sellingType);
        this.dairyCreamerAmount = dairyCreamerAmount;
        this.aKyaYayAmount = aKyaYayAmount;
        this.sugarAmount = sugarAmount;
        this.name = name;
    }

    public double getDairyCreamerAmount() {
        return dairyCreamerAmount;
    }

    public int getaKyaYayAmount() {
        return aKyaYayAmount;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public String getName() {
        return name;
    }

    public boolean isSufficientInStockForNewSale(DairyCreamerInventory dairyCreamerInventory,
                                                 SugarInventory sugarInventory,
                                                 AKyaYayInventory aKyaYayInventory,
                                                 int quantity) {

        return (dairyCreamerInventory.getInStockQuantity() > getDairyCreamerAmount() * quantity
                && sugarInventory.getInStockQuantity() > getSugarAmount() * quantity
                && aKyaYayInventory.getInStockQuantity() > getaKyaYayAmount() * quantity);
    }
}
