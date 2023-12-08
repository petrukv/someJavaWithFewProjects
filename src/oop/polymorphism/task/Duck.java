package oop.polymorphism.task;

public class Duck implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Duck Flies");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
