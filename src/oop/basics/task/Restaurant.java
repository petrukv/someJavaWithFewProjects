package oop.basics.task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog() {
        if (sausageCount > 0 && breadCount > 1) {
            sausageCount--;
            breadCount -= 2;
            System.out.println("Take your hot-dog");
        } else {
            System.out.println("We cant cook hot-dog");
        }
    }

    public void addProducts() {
        sausageCount += 100;
        breadCount += 200;
    }
}
