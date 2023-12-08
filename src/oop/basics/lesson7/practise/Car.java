package oop.basics.lesson7.practise;

public class Car {
    private String brand;
    private int maxSpeed = 220;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void investigateSpeed100 () {
        double speed = 110d / (this.maxSpeed / 20d);
        System.out.println(speed + "\n");
    }

    public String getBrand() {
        return brand;
    }
}
