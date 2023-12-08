package oop.basics.lesson7;

import oop.basics.lesson7.Zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Black", 10, "Peter");

//        cat.destroySofa("Peter");
//        String animal = cat.hunt(false);
//        System.out.println(animal);
//        String result = cat.hunt(false, false);
//        cat.hunt("Morning");
//
//        cat.feed("Peter", "Milk", "Fish");
//
        Dog dog = new Dog("Muhtar", -10, "Peter");
//        dog.setWeight(6);
//        System.out.println(dog);
//
//        System.out.println(dog.getOwner());
//
//        Dog dog1 = new Dog();
//        System.out.println(dog1);

        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }

}

