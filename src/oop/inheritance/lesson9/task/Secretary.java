package oop.inheritance.lesson9.task;

public class Secretary extends OfficeWorker {
    public Secretary(boolean isMan) {
        super(isMan);
    }

    @Override
    public void getSalary() {
        System.out.println("Secretary get 30_000");
    }
}
