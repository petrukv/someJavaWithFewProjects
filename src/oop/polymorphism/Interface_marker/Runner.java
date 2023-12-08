package oop.polymorphism.Interface_marker;

public class Runner {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        if(bird instanceof ALive) {
            System.out.println("This object is alive");
        }
        if(airplane instanceof ALive) {
            System.out.println("This object is alive");
        } else {
            System.out.println("This object is not alive");
        }
    }
}
