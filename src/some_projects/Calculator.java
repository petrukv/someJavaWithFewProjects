package some_projects;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter operator (  +  -  *  /  ): ");
        op = reader.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
            default: System.out.printf("Error!");
                return;
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
    }
}