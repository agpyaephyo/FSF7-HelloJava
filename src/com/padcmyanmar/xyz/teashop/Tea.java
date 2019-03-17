package com.padcmyanmar.xyz.teashop;

public class Tea extends HotBeverage {

    private double dairyCreamerAmount;
    private int aKyaYayAmount;
    private double sugarAmount;

    public Tea(SellingType sellingType, double dairyCreamerAmount,
               int aKyaYayAmount, double sugarAmount, String name) {
        super(name, sellingType);
        this.dairyCreamerAmount = dairyCreamerAmount;
        this.aKyaYayAmount = aKyaYayAmount;
        this.sugarAmount = sugarAmount;
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

    @Override
    public boolean isSufficientInStockForNewSale(int quantity) {
        return (TeaShopInventory.getObjInstance().getDairyCreamerInventory().getInStockQuantity() > getDairyCreamerAmount() * quantity
                && TeaShopInventory.getObjInstance().getSugarInventory().getInStockQuantity() > getSugarAmount() * quantity
                && TeaShopInventory.getObjInstance().getaKyaYayInventory().getInStockQuantity() > getaKyaYayAmount() * quantity);
    }
}
