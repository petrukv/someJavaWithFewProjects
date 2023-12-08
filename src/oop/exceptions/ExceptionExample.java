package oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int[] ints = new int[2];
            System.out.println(ints[3]);
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("it works");
    }
}
