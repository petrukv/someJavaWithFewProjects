package oop.polymorphism.interfaces.basics;

public class Car implements Moveable {
    public void move() {
        System.out.println("Car moves");
    }

    public void turnOf() {
        System.out.println("Car is turned of");
    }

    @Override
    public void back() {
        System.out.println("Car is going back");
    }
}
