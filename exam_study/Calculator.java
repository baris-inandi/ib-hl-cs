package exam_study;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = sc.nextInt();

        System.out.print("Enter the operator");
        String op = sc.nextLine();

        System.out.print("Enter the second number: ");
        double y = sc.nextInt();

        double result;
        switch (op) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            case "%":
                result = x % y;
                break;
            default:
                result = 0.0;
                System.out.println("You entered an invalid statement");
        }
        System.out.println(x + op + y + "=" + result);
        sc.close();

    }
}
