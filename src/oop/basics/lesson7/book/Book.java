package oop.basics.lesson7.book;

public class Book {
    String name;
    String authorName;
    int pages;
    boolean isDocumentary;

    public Book ( String name, String authorName, int pages, boolean isDocumentary) {
        this.name = name;
        this.authorName = authorName;
        this.pages = pages;
        this.isDocumentary = isDocumentary;
    }

    public void countOfLines () {
        System.out.println(this.pages * 40);
    }

    public void countOfLines (int linesInPage) {
        System.out.println(this.pages * linesInPage);
    }

    public void printInfo() {
        System.out.printf("%s by %s - %s", this.name, this.authorName, this.isDocumentary ? "Documentary" : "Not Documentary");
    }
}
