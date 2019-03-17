package com.padcmyanmar.xyz.teashop;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingTeaShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TeaShopInventory.getObjInstance();

        char newSaleOrSummary;
        Map<Timestamp, Sale> salesMap = new HashMap<>();
        do {
            System.out.println();
            System.out.print("Would you like to make a new sale (\'N\') or " +
                    "would you like to see the daily sale summary (\'S\') ? : ");
            newSaleOrSummary = scanner.next().charAt(0);

            if (newSaleOrSummary == 'S') {
                break;
            }

            char userContinue;
            Sale sale = new Sale();
            do {
                System.out.println();
                System.out.println("=== Please select one from the following menu ===");
                BlackCoffee.showBeverageWithChar();
                CoffeeHnutPhyaw.showBeverageWithChar();
                CoffeeMix.showBeverageWithChar();

                ChoKya.showBeverageWithChar();
                ChoSaint.showBeverageWithChar();
                KyaSaint.showBeverageWithChar();
                KyoutPaToung.showBeverageWithChar();
                PopKya.showBeverageWithChar();
                PopSaint.showBeverageWithChar();
                System.out.print("Please input your choice : ");
                char userChoiceBeverage = scanner.next().charAt(0);

                System.out.println();
                System.out.println("=== Please select the selling type ===");
                SineThout.showSellingTypeChar();
                SineThoutParSal.showSellingTypeChar();
                ParSalKyi.showSellingTypeChar();
                System.out.print("Please input your choice : ");
                char userChoiceST = scanner.next().charAt(0);

                SellingType sellingType;
                switch (userChoiceST) {
                    case SineThout.SINE_THOUT_CHAR:
                        sellingType = new SineThout();
                        break;
                    case SineThoutParSal.SINE_THOUT_PAR_SAL_CHAR:
                        sellingType = new SineThoutParSal();
                        break;
                    case ParSalKyi.PAR_SAL_KYI_CHAR:
                        sellingType = new ParSalKyi();
                        break;
                    default:
                        throw new UnsupportedOperationException("Character input for selling type \'"
                                + userChoiceST + "\' is not supported");
                }

                HotBeverage userSelectedHB;
                switch (userChoiceBeverage) {
                    case ChoKya.CHO_KYA_CHAR:
                        userSelectedHB = new ChoKya(sellingType);
                        break;
                    case KyaSaint.KYA_SAINT_CHAR:
                        userSelectedHB = new KyaSaint(sellingType);
                        break;
                    case PopKya.POP_KYA_CHAR:
                        userSelectedHB = new PopKya(sellingType);
                        break;
                    case PopSaint.POP_SAINT_CHAR:
                        userSelectedHB = new PopSaint(sellingType);
                        break;
                    case ChoSaint.CHO_SAINT_CHAR:
                        userSelectedHB = new ChoSaint(sellingType);
                        break;
                    case KyoutPaToung.KYOUT_PA_TOUNG_CHAR:
                        userSelectedHB = new KyoutPaToung(sellingType);
                        break;
                    case CoffeeHnutPhyaw.HNUT_PHYAW_CHAR:
                        userSelectedHB = new CoffeeHnutPhyaw(sellingType);
                        break;
                    case CoffeeMix.COFFEE_MIX_CHAR:
                        userSelectedHB = new CoffeeMix(sellingType);
                        break;
                    case BlackCoffee.BLACK_COFFEE_CHAR:
                        userSelectedHB = new BlackCoffee(sellingType);
                        break;
                    default:
                        throw new UnsupportedOperationException("Character input for tea \'"
                                + userChoiceBeverage + "\' is not supported");
                }

                System.out.print("Please input the quantity : ");
                int quantity = scanner.nextInt();

                if (userSelectedHB.isSufficientInStockForNewSale(quantity)) {
                    //enough inventory.
                    TeaShopInventory.getObjInstance().updateInventoryForNewSale(userSelectedHB, quantity);

                    SaleItem saleItem = new SaleItem(userSelectedHB, quantity);
                    sale.addNewSaleItem(saleItem);

                    System.out.print("Would like to buy another tea ? (y/n) : ");
                    userContinue = scanner.next().charAt(0);

                } else {
                    //not enough inventory.
                    System.out.println("Not enough inventory to sell " + quantity
                            + " cup(s) of " + userSelectedHB.getName());
                    userContinue = 'n';
                }
            } while (userContinue == 'y');

            double total = 0.0;
            for (SaleItem saleItem : sale.getSaleItems()) {
                double subTotal = saleItem.getSaleQuantity() * saleItem.getSaleHotBeverage().getSellingType().getPrice();
                total += subTotal;
                System.out.println(saleItem.getSaleHotBeverage().getSellingType().getName()
                        + saleItem.getSaleHotBeverage().getName()
                        + "(" + saleItem.getSaleQuantity() + " cup(s)) : "
                        + subTotal + " mmk");
            }
            System.out.println("Total : " + total + " mmk");

            salesMap.put(sale.getTimestamp(), sale);
        } while (true);

        //
        for (Timestamp timestamp : salesMap.keySet()) {
            Sale sale = salesMap.get(timestamp);
            for (SaleItem saleItem : sale.getSaleItems()) {
                double price = saleItem.getSaleHotBeverage().getSellingType().getPrice();
                if (saleItem.getSaleHotBeverage() instanceof ChoSaint) {
                    ChoSaint.addTotalChoSaintCups(saleItem.getSaleQuantity());
                    ChoSaint.addSubTotal(price);
                } else if (saleItem.getSaleHotBeverage() instanceof KyaSaint) {
                    KyaSaint.addTotalKyaSaintCups(saleItem.getSaleQuantity());
                    KyaSaint.addSubTotal(price);
                } else if (saleItem.getSaleHotBeverage() instanceof PopSaint) {
                    PopSaint.addTotalPopSaintCups(saleItem.getSaleQuantity());
                    PopSaint.addSubTotal(price);
                } else if (saleItem.getSaleHotBeverage() instanceof PopKya) {
                    PopKya.addTotalPopKyaCups(saleItem.getSaleQuantity());
                    PopKya.addSubTotal(price);
                } else if (saleItem.getSaleHotBeverage() instanceof ChoKya) {
                    ChoKya.addTotalChoKyaCup(saleItem.getSaleQuantity());
                    ChoKya.addSubTotal(price);
                } else if (saleItem.getSaleHotBeverage() instanceof KyoutPaToung) {
                    KyoutPaToung.addTotalKyoutPaToungCups(saleItem.getSaleQuantity());
                    KyoutPaToung.addSubTotal(price);
                }
            }
        }

        System.out.println("=== Total Sale Summary ===");
        ChoSaint.showSubTotal();
        KyaSaint.showSubTotal();
        PopSaint.showSubTotal();
        PopKya.showSubTotal();
        ChoKya.showSubTotal();
        KyoutPaToung.showSubTotal();

        double totalSale = ChoSaint.getSubTotalForChoSaintSales()
                + KyaSaint.getSubTotalForKyaSaintSales()
                + PopSaint.getSubTotalForPopSaintSales()
                + PopKya.getSubTotalForPopKyaSales()
                + ChoKya.getSubTotalForChoKyaSales()
                + KyoutPaToung.getSubTotalForKyoutPaToungSale();
        System.out.println(">>>> Total Sale for Today : " + totalSale + " mmk");

        TeaShopInventory.getObjInstance().showTodayUseOfInventorySummary();
        TeaShopInventory.getObjInstance().showRemainingInventoryForToday();
    }
}
