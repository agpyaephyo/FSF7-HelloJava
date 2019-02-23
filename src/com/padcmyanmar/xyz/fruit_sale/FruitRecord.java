package com.padcmyanmar.xyz.fruit_sale;

public class FruitRecord {

    public final static FruitType papaya;
    public final static FruitType waterMelon;
    public final static FruitType grape;
    public final static FruitType pineApple;
    public final static FruitType durian;

    static {
        papaya = new FruitType("တစ်လုံး", 5200,
                "Papaya (သဘော်သီး)");
        waterMelon = new FruitType("တစ်လုံး", 3500,
                "Water Melon (ဖရဲသီး)");
        grape = new FruitType("1 Kg", 6800,
                "Grape (စပျစ်သီး)");
        pineApple = new FruitType("တစ်လုံး", 4800,
                "Pine Apple (နာနတ်သီး)");
        durian = new FruitType("တစ်လုံး", 8500,
                "Durian (ဒူးရင်းသီး)");
    }

    public static void showFruitRecord() {
        System.out.println("\'P\' for " + papaya.getName());
        System.out.println("\'W\' for " + waterMelon.getName());
        System.out.println("\'G\' for " + grape.getName());
        System.out.println("\'A\' for " + pineApple.getName());
        System.out.println("\'D\' for " + durian.getName());
        System.out.println("*** \'F\' for Finish Sale");
        System.out.println();
    }
}
