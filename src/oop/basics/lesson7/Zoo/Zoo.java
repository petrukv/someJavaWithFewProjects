package oop.basics.lesson7.Zoo;

import oop.basics.lesson7.Cat;
import oop.basics.lesson7.Dog;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Vadym","Fish");
        dog.feed("Oleksiy", "Bones");
    }
}
