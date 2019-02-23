package com.padcmyanmar.xyz.tollbooth;

public class TollBooth {

    private int moneyAmountByCarType1;
    private int moneyAmountByCarType2;
    private int moneyAmountByCarType3;
    private int moneyAmountByCarType4;

    private int totalCarByCarType1;
    private int totalCarByCarType2;
    private int totalCarByCarType3;
    private int totalCarByCarType4;

    public TollBooth() {
        moneyAmountByCarType1 = 1000;
        moneyAmountByCarType2 = 2000;
        moneyAmountByCarType3 = 3000;
        moneyAmountByCarType4 = 4000;
    }

    /**
     * CarType အပေါ်မူတည်ပြီးတော့ သူ့ရဲ့ totalAmount ကိုု 1 တိုုးမယ် ။
     * Param : CarType
     */
    void increaseTotalAmountByCarType(char carType) {
        switch (carType) {
            case '1':
                totalCarByCarType1++;
                System.out.println("Car Type “1” in total : " + totalCarByCarType1);
                break;
            case '2':
                totalCarByCarType2++;
                System.out.println("Car Type “2” in total : " + totalCarByCarType2);
                break;
            case '3':
                totalCarByCarType3++;
                System.out.println("Car Type “3” in total : " + totalCarByCarType3);
                break;
            case '4':
                totalCarByCarType4++;
                System.out.println("Car Type “4” in total : " + totalCarByCarType4);
                break;
            default:
                System.out.println("Wrong instruction. Please only input (1,2,3,4) or “E”");
        }
    }

    /**
     * End-of-Duty မှာ ရှိမဲ့ carType တစ်ခုချင်းစီရဲ့ summary ကို ပြပေးမှာ
     */
    void showEndOfDutySummary() {
        int endOfDaySummaryType1 = totalCarByCarType1 * moneyAmountByCarType1;
        System.out.println("Car Type 1 in total : " + totalCarByCarType1 + " - " + endOfDaySummaryType1 + " mmk");
        int endOfDaySummaryType2 = totalCarByCarType2 * moneyAmountByCarType2;
        System.out.println("Car Type 2 in total : " + totalCarByCarType2 + " - " + endOfDaySummaryType2 + " mmk");
        int endOfDaySummaryType3 = totalCarByCarType3 * moneyAmountByCarType3;
        System.out.println("Car Type 3 in total : " + totalCarByCarType3 + " - " + endOfDaySummaryType3 + " mmk");
        int endOfDaySummaryType4 = totalCarByCarType4 * moneyAmountByCarType4;
        System.out.println("Car Type 4 in total : " + totalCarByCarType4 + " - " + endOfDaySummaryType4 + " mmk");

        int totalForToday = endOfDaySummaryType1 + endOfDaySummaryType2
                + endOfDaySummaryType3 + endOfDaySummaryType4;
        System.out.println("Total for Feb 10th : " + totalForToday);
    }
}
