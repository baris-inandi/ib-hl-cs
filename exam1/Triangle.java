package study_and_extras;

public class Triangle {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
