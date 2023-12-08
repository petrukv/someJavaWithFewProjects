package oop.polymorphism.interface_segregation;

import oop.polymorphism.task.Flyable;

public class Airplane implements Flyable, Drivable  {
    @Override
    public void fly() {
        System.out.println("Airplane flies");
    }

    @Override
    public void drive() {
        System.out.println("Airplane drives");
    }
}
