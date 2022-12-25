package study_and_extras;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = 5124;
        int userAnswer;
        do {
            System.out.print("Enter the password: ");
            userAnswer = sc.nextInt();
        } while (pass != userAnswer);
        System.out.println("Correct password");
        sc.close();
    }
}
