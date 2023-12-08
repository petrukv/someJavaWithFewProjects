package oop.inheritance.lesson9;

import oop.inheritance.lesson9.dogs.Poodle;
import oop.inheritance.lesson9.dogs.Shepherd;

public class Runner {
    public static void main(String[] args) {

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        poodle.breathe();
        System.out.println(poodle.countTeeth);

        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breathe();
        System.out.println(shepherd.countTeeth);
        shepherd.beAngry();
    }
}
