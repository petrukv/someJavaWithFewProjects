package oop.polymorphism.interface_inheritance;

public interface Moveable {
    default void move(){
        System.out.println("Objects moves and eats");
    };

    void eat();
}
