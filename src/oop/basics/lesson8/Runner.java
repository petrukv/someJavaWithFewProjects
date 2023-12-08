package oop.basics.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        System.out.println(Car.countCars);
        Car audi = new Car("Audi");
//        System.out.println(audi.getCountCars());
        Car bmw = new Car("BMW");
//        System.out.println(bmw.getCountCars());
//
//        Car.printBrands();
//        System.out.println(Car.BMW_INFO);
//
        Car.BRAND_DESCRIPTIONS[0] = "Another description";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));

    }
}
