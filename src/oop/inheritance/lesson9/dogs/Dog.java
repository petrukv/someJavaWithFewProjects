package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.Alive;

public abstract class Dog extends Alive {

    public static final String LATTIN_NAME = "Canis familiaris";
    protected int countLegs = 4;
    public int countTeeth;

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }

    public void beAngry() {
        System.out.println("Dog is angry ");
    }
    public void bark() {
        System.out.println("Dog barks!");
    }

    public final void eat() {
        System.out.println("Dog eats");
    }

    public abstract void run();
}
