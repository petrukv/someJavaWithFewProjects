package oop.polymorphism.interface_segregation;

import oop.polymorphism.task.Flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}
