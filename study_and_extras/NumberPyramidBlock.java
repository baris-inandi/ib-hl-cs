public class NumberPyramidBlock {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i<=n; i++) {
            int starCount = n;
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
                starCount--;
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
