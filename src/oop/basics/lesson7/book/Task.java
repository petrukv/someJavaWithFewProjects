package oop.basics.lesson7.book;

public class Task {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J.K. Rowling", 320, false);
        book.countOfLines();
        book.countOfLines(45);
        book.printInfo();
    }
}
