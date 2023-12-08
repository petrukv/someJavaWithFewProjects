package oop.equals_and_hashcode.hashcode;

import oop.equals_and_hashcode.Child;

public class HashCode_exm {
    public static void main(String[] args) {
        Child child1 = new Child("Kirov Sergei", 2018);
        Child child2 = new Child("Petrov Ivan", 2018);
        Child child3 = new Child("Kravtsov Andrii", 2019);
        Child child4 = new Child("Mudryk Misha", 2019);

        Child[] group0 = {child1, child2};
        Child[] group1 = {child3, child4};
        Child[][] children = {group0, group1};

        Child childForFind = new Child("Petrov Ivan", 2018);
        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);

        boolean result = false;

        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if(child.equals(childForFind)) {
                result = true;
                break;
            }

        }
        System.out.println(result);

    }
}

