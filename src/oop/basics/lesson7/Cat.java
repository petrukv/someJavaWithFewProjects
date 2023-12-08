package oop.basics.lesson7;

import java.util.Arrays;

public class Cat {
    private String color;
    private double weight;
    private String ownerName;

    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Cat destroys sofa %s", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay){
            return "Mouse";
        }
        return "Owl";
    }

    public String hunt(boolean isDay, boolean success) {
        if (success){
            if (isDay){
                return "Mouse";
            }
            return "Owl";
        }
        return "Nothing";
    }

    public void hunt(String timesOfDay){
        if (timesOfDay.equals("Morning")){
            System.out.println("Mouse");
        } else {
            System.out.println("Fish");
        }
    }

    public void feed(String giver, String ...product) {
        System.out.printf("%s gave %s to Cat", giver, Arrays.toString(product));
    }
}
