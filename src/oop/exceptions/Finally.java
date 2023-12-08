package oop.exceptions;

public class Finally {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            throw new ArithmeticException("Arithmetic exc");
        } finally {
            System.out.println("Works");
        }
    }
}
