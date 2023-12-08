package input_output;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args) {
        Calc calc = new Calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number");
        long l1 = scanner.nextLong();

        System.out.println("Input operation");
        String operation = scanner.next();

        System.out.println("Input 2nd number");
        long l2 = scanner.nextLong();

        System.out.println(calc.makeOperation(l1, l2, operation));
    }
}
