import java.util.Scanner;
import java.util.stream.IntStream;

public class HW1 {

    public static final Scanner sc = new Scanner(System.in);

    public static void task1(int num1, int num2) {
        int answer = num1 + num2;
        String question = String.format("What is %d+%d?: ", num1, num2);
        do
            System.out.print(question);
        while (answer != sc.nextInt());
    }

    public static void task2() {
        int jumps = 0;
        while (!sc.nextLine().equalsIgnoreCase("y")) {
            System.out.print("Tired yet? [y/N] ");
            ++jumps;
        }
        System.out.printf("You jumped %d times%n", jumps);
    }

    public static void task3(int repeats) {
        IntStream.rangeClosed(1, repeats).forEach(a -> System.out.printf("I jumped %d time(s)!%n", a));
    }

    public static void task4() {
        int num = (int) (Math.random() * 50);
        int user;
        do {
            System.out.print("Guess a number: ");
            user = sc.nextInt();
            System.out.println(
                    user > num
                            ? "Too high"
                            : user < num
                                    ? "Too low"
                                    : "Correct!");
        } while (user != num);
    }

    public static void main(String[] args) {
        System.out.println("\nTask 1: Keep asking for sum of two numbers until its correct");
        task1(3, 5);

        System.out.println("\nTask 2: Jump until tired");
        task2();

        System.out.println("\nTask 3: Jump 10 times");
        task3(10);

        System.out.println("\nTask 4: Number guessing game");
        task4();
    }
}
