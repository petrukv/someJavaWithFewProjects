package oop.basics.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    public static int countCars = 0;
    public final static String BMW_INFO = "BMW is a German multinational manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany.";
    public final static String AUDI_INFO = "Audi AG is a German automobile manufacturer with headquarters in Ingolstadt, Bavaria,";
    public final static String KIA_INFO = "is a car company. The headquarters are in Seoul, South Korea";

    public final static String[] BRAND_DESCRIPTIONS = new String[3];
    static {
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTIONS));
    }
    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("Bmw, Audi, Kia");
    }
}
