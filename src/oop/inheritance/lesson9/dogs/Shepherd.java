package oop.inheritance.lesson9.dogs;

public class Shepherd extends Dog{

    public Shepherd() {
        super(27);
    }

    @Override
    public void run() {
        System.out.println("Dog runs fast");
    }

    @Override
    public void breathe() {
        System.out.println("Shepherd breathes");
    }

    @Override
    public void bark() {
        System.out.println("Shepherd barks");
    }
@Override
    public void beAngry() {
        System.out.println("Dog saw a stranger");
        super.beAngry();
        System.out.println("Dog is calmed down");
    }
}
