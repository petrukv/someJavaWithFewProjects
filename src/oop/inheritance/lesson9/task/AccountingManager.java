package oop.inheritance.lesson9.task;

public class AccountingManager extends OfficeWorker {
    public AccountingManager(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("AccountingManager get 50_000");
    }
}
