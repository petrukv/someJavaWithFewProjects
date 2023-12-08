package oop.equals_and_hashcode;

public class Example {
    public static void main(String[] args) {
        Child child1 = new Child("Kirov Sergei", 2019);
        Child child2 = new Child("Petrov Ivan", 2019);
        Child child3 = new Child("Kravtsov Andrii", 2019);
        Child child4 = new Child("Mudryk Misha", 2019);

        Child[] children = {child1, child2, child3, child4};
        ChildrenGarden childrenGarden = new ChildrenGarden(children);

        boolean result = false;
        Child childForFind =  new Child("Kirov Sergei", 2019);

        for (Child child : childrenGarden.getChildren()) {
            if ( child.equals(childForFind) ) {
                result = true;
                break;
            }
        }
        System.out.println(result);

    }
}
