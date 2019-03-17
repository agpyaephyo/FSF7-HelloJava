package com.padcmyanmar.xyz.teashop;

import java.util.Scanner;

public class TeaShopInventory {

    private DairyCreamerInventory dairyCreamerInventory;
    private SugarInventory sugarInventory;
    private AKyaYayInventory aKyaYayInventory;
    private CoffeePowderInventory coffeePowderInventory;
    private CoffeeMixInventory coffeeMixInventory;
    private LimeInventory limeInventory;

    private static TeaShopInventory objInstance;

    public static TeaShopInventory getObjInstance() {
        if (objInstance == null) {
            objInstance = new TeaShopInventory();
        }
        return objInstance;
    }

    private TeaShopInventory() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input purchasing quantity for Dairy Creamer : ");
        int dairyCreamerPQ = scanner.nextInt();
        dairyCreamerInventory =
                new DairyCreamerInventory(dairyCreamerPQ);

        System.out.print("Please input purchasing quantity for AKyaYay : ");
        int aKyaYayPQ = scanner.nextInt();
        aKyaYayInventory =
                new AKyaYayInventory(aKyaYayPQ);

        System.out.print("Please input purchasing quantity for Sugar : ");
        int sugarPQ = scanner.nextInt();
        sugarInventory =
                new SugarInventory(sugarPQ);

        System.out.print("Please input purchasing quantity for Coffee Powder : ");
        int coffeePowderPQ = scanner.nextInt();
        coffeePowderInventory =
                new CoffeePowderInventory(coffeePowderPQ);

        System.out.print("Please input purchasing quantity for Lime : ");
        int limePQ = scanner.nextInt();
        limeInventory =
                new LimeInventory(limePQ);

        System.out.print("Please input purchasing quantity for Coffee Mix : ");
        int coffeeMixPQ = scanner.nextInt();
        coffeeMixInventory =
                new CoffeeMixInventory(coffeeMixPQ);
    }

    public DairyCreamerInventory getDairyCreamerInventory() {
        return dairyCreamerInventory;
    }

    public SugarInventory getSugarInventory() {
        return sugarInventory;
    }

    public AKyaYayInventory getaKyaYayInventory() {
        return aKyaYayInventory;
    }

    public CoffeePowderInventory getCoffeePowderInventory() {
        return coffeePowderInventory;
    }

    public CoffeeMixInventory getCoffeeMixInventory() {
        return coffeeMixInventory;
    }

    public LimeInventory getLimeInventory() {
        return limeInventory;
    }

    public void updateInventoryForNewSale(HotBeverage userSelectedBeverage, int quantity) {
        if (userSelectedBeverage instanceof Tea) {
            Tea teaBeverage = (Tea) userSelectedBeverage;
            dairyCreamerInventory.updateInventoryForNewSale(teaBeverage, quantity);
            sugarInventory.updateInventoryForNewSale(teaBeverage, quantity);
            aKyaYayInventory.updateInventoryForNewSale(teaBeverage, quantity);
        } else if (userSelectedBeverage instanceof CoffeeHnutPhyaw) {
            CoffeeHnutPhyaw coffeeHnutPhyaw = (CoffeeHnutPhyaw) userSelectedBeverage;
            dairyCreamerInventory.updateInventoryForNewSale(coffeeHnutPhyaw, quantity);
            sugarInventory.updateInventoryForNewSale(coffeeHnutPhyaw, quantity);
            coffeePowderInventory.updateInventoryForNewSale(coffeeHnutPhyaw, quantity);
        } else if (userSelectedBeverage instanceof CoffeeMix) {
            CoffeeMix coffeeMix = (CoffeeMix) userSelectedBeverage;
            dairyCreamerInventory.updateInventoryForNewSale(coffeeMix, quantity);
            coffeeMixInventory.updateInventoryForNewSale(coffeeMix, quantity);
        } else if (userSelectedBeverage instanceof BlackCoffee) {
            BlackCoffee blackCoffee = (BlackCoffee) userSelectedBeverage;
            coffeePowderInventory.updateInventoryForNewSale(blackCoffee, quantity);
            sugarInventory.updateInventoryForNewSale(blackCoffee, quantity);
            limeInventory.updateInventoryForNewSale(blackCoffee, quantity);
        }
    }

    public void showTodayUseOfInventorySummary() {
        System.out.println();
        System.out.println("=== Today Use of Inventory Summary ===");
        dairyCreamerInventory.showUsedStock();
        aKyaYayInventory.showUsedStock(totalAKyaYayUse);
        sugarInventory.showUsedStock(totalSugarUse);
    }

    public void showRemainingInventoryForToday() {
        System.out.println();
        System.out.println("=== Remaining Inventory for Today ===");
        dairyCreamerInventory.showRemainingStock();
        aKyaYayInventory.showRemainingStock();
        sugarInventory.showRemainingStock();
    }
}
