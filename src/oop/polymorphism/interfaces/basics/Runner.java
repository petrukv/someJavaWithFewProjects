package oop.polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
//        car.move();
//        dog.move();

        Moveable[] movables = new Moveable[2];
        movables[0] = car;
        movables[1] = dog;
        for (Moveable movable : movables){
            movable.move();
            movable.back();
        }

    }
}
