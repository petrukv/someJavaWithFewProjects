package oop.polymorphism.functional_interface;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat();
        cat.makeSound();

        Sounding bird = () -> System.out.println("Bird sings");
        bird.makeSound();
    }
}
