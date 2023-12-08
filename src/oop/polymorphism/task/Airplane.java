package oop.polymorphism.task;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane flies");
    }
}
