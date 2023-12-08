package oop.inheritance.lesson9.task;

public class Task {
    public static void main(String[] args) {
        Defender defender = new Defender(true);
        Secretary secretary = new Secretary(false);
        AccountingManager accountingManager = new AccountingManager(false);

        defender.getSalary();
        secretary.getSalary();
        accountingManager.getSalary();
        accountingManager.drinkCoffee();
    }
}

