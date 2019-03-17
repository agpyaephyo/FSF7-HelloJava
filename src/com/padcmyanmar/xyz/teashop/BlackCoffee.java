package com.padcmyanmar.xyz.teashop;

public class BlackCoffee extends Coffee {

    private static final int BLACK_COFFEE_COFFEE_POWDER_AMOUNT = 4;
    private static final int BLACK_COFFEE_SUGAR_AMOUNT = 2;
    private static final int BLACK_COFFEE_LIME_SLICE = 1;

    public static final char BLACK_COFFEE_CHAR = 'B';

    private int coffeePowderAmount;
    private int sugerAmount;
    private int limeSlice;

    public BlackCoffee(SellingType sellingType) {
        super(sellingType);
        coffeePowderAmount = BLACK_COFFEE_COFFEE_POWDER_AMOUNT;
        sugerAmount = BLACK_COFFEE_SUGAR_AMOUNT;
        limeSlice = BLACK_COFFEE_LIME_SLICE;
    }

    public int getCoffeePowderAmount() {
        return coffeePowderAmount;
    }

    public int getSugerAmount() {
        return sugerAmount;
    }

    public int getLimeSlice() {
        return limeSlice;
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + BLACK_COFFEE_CHAR + "\' Black Coffee");
    }

    @Override
    public boolean isSufficientInStockForNewSale(int quantity) {
        return (TeaShopInventory.getObjInstance().getCoffeePowderInventory().getInStockQuantity() > getCoffeePowderAmount() * quantity
                && TeaShopInventory.getObjInstance().getSugarInventory().getInStockQuantity() > getSugerAmount() * quantity
                && TeaShopInventory.getObjInstance().getLimeInventory().getInStockQuantity() > getLimeSlice() * quantity);
    }
}
