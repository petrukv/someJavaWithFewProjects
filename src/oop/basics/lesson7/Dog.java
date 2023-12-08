package oop.basics.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Andrii";

    {
        System.out.println("Dog was created");
    }
    public Dog() {
    }
    public Dog(String name, int weight, String owner) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
    }
    public void feed(String giver, String ...product) {
        System.out.printf("%s gave %s to Dog", giver, Arrays.toString(product));
    }
    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr. " + owner;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}

