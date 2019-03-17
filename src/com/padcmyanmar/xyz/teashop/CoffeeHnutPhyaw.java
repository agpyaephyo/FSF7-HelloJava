package com.padcmyanmar.xyz.teashop;

public class CoffeeHnutPhyaw extends Coffee {

    private static final int COFFEE_HNUT_PHYAW_DAIRY_CREAMER_AMOUNT = 2;
    private static final int COFFEE_HNUT_PHYAW_COFFEE_POWDER_AMOUNT = 3;
    private static final int COFFEE_HNUT_PHYAW_SUGAR_AMOUNT = 3;

    public static final char HNUT_PHYAW_CHAR = 'H';

    private int dairyCreamerAmount;
    private int coffeePowderAmount;
    private int sugarAmount;

    public CoffeeHnutPhyaw(SellingType sellingType) {
        super(sellingType);
        dairyCreamerAmount = COFFEE_HNUT_PHYAW_DAIRY_CREAMER_AMOUNT;
        coffeePowderAmount = COFFEE_HNUT_PHYAW_COFFEE_POWDER_AMOUNT;
        sugarAmount = COFFEE_HNUT_PHYAW_SUGAR_AMOUNT;
    }

    @Override
    public boolean isSufficientInStockForNewSale(int quantity) {
        return (TeaShopInventory.getObjInstance().getDairyCreamerInventory().getInStockQuantity() > getDairyCreamerAmount() * quantity
                && TeaShopInventory.getObjInstance().getSugarInventory().getInStockQuantity() > getSugarAmount() * quantity
                && TeaShopInventory.getObjInstance().getCoffeePowderInventory().getInStockQuantity() > getCoffeePowderAmount() * quantity);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + HNUT_PHYAW_CHAR + "\' for Hnut Phyaw Coffee");
    }

    public int getDairyCreamerAmount() {
        return dairyCreamerAmount;
    }

    public int getCoffeePowderAmount() {
        return coffeePowderAmount;
    }

    public int getSugarAmount() {
        return sugarAmount;
    }
}
