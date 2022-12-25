package study_and_extras;

class Diamond {
    public static void main(String args[]) {
        int size = 7, center = 1, numberOfSpace = size / 2;
        for (int i = 1; i <= size; i++) {
            for (int k = numberOfSpace; k >= 1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= center; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < size / 2 + 1) {
                center += 2;
                numberOfSpace -= 1;
            } else {
                center -= 2;
                numberOfSpace += 1;

            }
        }
    }
}