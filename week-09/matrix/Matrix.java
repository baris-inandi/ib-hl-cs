public class Matrix {
    public static void main(String[] args) {
        int n = 20;
        int rows = 6; // rows
        int columns = 5; // columns
        int[][] hall = new int[rows][columns];
        int studentID = 0;
        System.out.print("   ");
        for (int i = 0; i < columns; i++) {
            System.out.printf("%4s", i + 1);
        }
        System.out.print("\n  ╭");
        for (int i = 0; i < columns; i++) {
            System.out.print("─".repeat(4));
        }
        System.out.println();
        for (int i = 0; i < rows; i++) { // for every row
            System.out.print(i + 1 + " │");
            for (int j = 0; j < columns; j++) { // row every column
                if (studentID >= n) {
                    System.out.print("  ▒▒");
                    continue;
                }
                hall[i][j] = studentID + 1;
                System.out.printf("%4s", studentID + 1);
                studentID++;
            }
            System.out.println();
        }
    }
}
