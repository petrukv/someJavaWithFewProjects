package oop.polymorphism.functional_interface;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("cat makes sounds");
    }
}
