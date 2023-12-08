package oop.inheritance.lesson9.dogs;

public class Poodle extends Dog {

    public Poodle() {
        super(36);
    }
    public void run() {
        System.out.println("Dog runs slowly");
    }

    @Override
    public void breathe() {
        System.out.println("Poodle breathes");
    }
}
