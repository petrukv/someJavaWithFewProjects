package oop.exceptions;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        startCar(0);
        System.out.println("Driving");
    }

    public static void startCar (int fuel) {
        checkFuel(fuel);
        System.out.println("Driving");
    }


    public static void checkFuel(int fuel) {
        if (fuel <= 0) {
            throw new RuntimeException("get some oil");
        }
    }
}
