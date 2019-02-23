package com.padcmyanmar.xyz.fruit_sale;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingFruitSale {

    public static void main(String[] args) {
        System.out.println("======== Fruit Sale for Feb 12th ========");

        char dailySummaryOrSale;
        Scanner scanner = new Scanner(System.in);
        ArrayList<FruitSale> fruitSales = new ArrayList<>();
        do {
            System.out.println("\'D\' for Daily Summary");
            System.out.println("\'S\' for Start making a new sale");
            System.out.print("Please type your input : ");

            dailySummaryOrSale = scanner.next().charAt(0);

            FruitSale fruitSale = new FruitSale();
            if (dailySummaryOrSale == 'S') {
                FruitRecord.showFruitRecord();

                char fruitTypeOrF;
                do {
                    System.out.print("Pls input the fruit type for \'F\' : ");
                    fruitTypeOrF = scanner.next().charAt(0);
                    switch (fruitTypeOrF) {
                        case 'P': {
                            System.out.print("How many : ");
                            int howManyP = scanner.nextInt();
                            fruitSale.addSaleItem(howManyP, FruitRecord.papaya);
                        }
                        break;
                        case 'W': {
                            System.out.print("How many : ");
                            int howManyW = scanner.nextInt();
                            fruitSale.addSaleItem(howManyW, FruitRecord.waterMelon);
                        }
                        break;
                        case 'G': {
                            System.out.print("How many : ");
                            int howManyG = scanner.nextInt();
                            fruitSale.addSaleItem(howManyG, FruitRecord.grape);
                        }
                        break;
                        case 'A': {
                            System.out.print("How many : ");
                            int howManyA = scanner.nextInt();
                            fruitSale.addSaleItem(howManyA, FruitRecord.pineApple);
                        }
                        break;
                        case 'D': {
                            System.out.print("How many : ");
                            int howManyD = scanner.nextInt();
                            fruitSale.addSaleItem(howManyD, FruitRecord.durian);
                        }
                    }
                } while (fruitTypeOrF != 'F');

                fruitSale.showSaleSummary();
                fruitSales.add(fruitSale);
            }
        } while (dailySummaryOrSale == 'S');

        int totalCountPapaya = 0, totalCountWaterMelon = 0, totalGrape = 0,
                totalPineApple = 0, totalDurian = 0;

        for (FruitSale fruitSale : fruitSales) {
            for (SaleItem saleItem : fruitSale.getSaleItems()) {
                switch (saleItem.getFruitType().getName()) {
                    case "Papaya (သဘော်သီး)":
                        totalCountPapaya += saleItem.getQuantity();
                        break;
                    case "Water Melon (ဖရဲသီး)":
                        totalCountWaterMelon += saleItem.getQuantity();
                        break;
                    case "Grape (စပျစ်သီး)":
                        totalGrape += saleItem.getQuantity();
                        break;
                    case "Pine Apple (နာနတ်သီး)":
                        totalPineApple += saleItem.getQuantity();
                        break;
                    case "Durian (ဒူးရင်းသီး)":
                        totalDurian += saleItem.getQuantity();
                        break;
                }
            }
        }

        System.out.println("==== Daily Summary ====");
        double subTotalPapaya = totalCountPapaya * FruitRecord.papaya.getPrice();
        double subTotalWaterMelon = totalCountWaterMelon * FruitRecord.waterMelon.getPrice();
        double subTotalGrape = totalGrape * FruitRecord.grape.getPrice();
        double subTotalPineApple = totalPineApple * FruitRecord.pineApple.getPrice();
        double subTotalDurian = totalDurian * FruitRecord.durian.getPrice();

        double dailyTotal = subTotalPapaya + subTotalWaterMelon + subTotalGrape
                + subTotalPineApple + subTotalDurian;

        System.out.println("Total Papaya Sale : " + totalCountPapaya + " - "
                + subTotalPapaya);
        System.out.println("Total Water Melon Sale : " + totalCountWaterMelon + " - "
                + subTotalWaterMelon);
        System.out.println("Total Grape Sale : " + totalGrape + " - "
                + subTotalGrape);
        System.out.println("Total Pine Apple Sale : " + totalPineApple + " - "
                + subTotalPineApple);
        System.out.println("Total Durian Sale : " + totalDurian + " - "
                + subTotalDurian);

        System.out.println("Daily Total : " + dailyTotal + " mmk");
    }
}
