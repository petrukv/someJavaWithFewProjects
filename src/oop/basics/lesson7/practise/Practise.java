package oop.basics.lesson7.practise;

public class Practise {
    public static void main(String[] args) {
        Car audi = new Car("Audi");
//        audi.investigateSpeed100();

        Car bmw = new Car("BMW", 300);
//        bmw.investigateSpeed100();

        Garage garage = new Garage();
        garage.setCar1(audi);
        garage.setCar2(bmw);
        garage.getInfoAboutCars();
    }
}
