package oop.polymorphism.interface_inheritance;

public interface Eatable {
    default void eat() {
        System.out.println("Object eats");
    };
}
