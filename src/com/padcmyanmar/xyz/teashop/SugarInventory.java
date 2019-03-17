package com.padcmyanmar.xyz.teashop;

public class SugarInventory extends Inventory {

    private static final int SUGER_PSC = 350;
    private static final String SUGER_PCU = "pack";
    private static final String SUGER_ISU = "tea-spoon";
    private static final String SUGER_INVENTORY_TYPE = "Sugar";

    public SugarInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * SUGER_PSC,
                SUGER_PCU, SUGER_ISU,
                SUGER_PSC,
                SUGER_INVENTORY_TYPE);
    }

    public void updateInventoryForNewSale(Tea tea, int sellingQuantity) {
        inStockQuantity -= tea.getSugarAmount() * sellingQuantity;
    }

    public void updateInventoryForNewSale(CoffeeHnutPhyaw coffeeHnutPhyaw, int sellingQuantity) {
        inStockQuantity -= coffeeHnutPhyaw.getSugarAmount() * sellingQuantity;
    }

    public void updateInventoryForNewSale(BlackCoffee blackCoffee, int sellingQuantity) {
        inStockQuantity -= blackCoffee.getSugerAmount() * sellingQuantity;
    }
}
