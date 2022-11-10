import java.util.Arrays;

public class MatrixRandom {
    static final int rows = 6; // rows
    static final int columns = 5; // columns
    static final int n = 20;
    static String[] takenSeatCorrdinates = new String[n];

    public static int getRandomBetween(int min, int max) {
        return (int) (min + Math.random() * (max - min));
    }

    public static boolean isCoordinateTaken(int x, int y) {
        String coor = x + "" + y;
        for (String z : takenSeatCorrdinates) {
            if (z.equals(coor)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] hall = new int[rows][columns];
        int studentID = 1;
        for (int i = 0; i < rows; i++) { // for every row
            for (int j = 0; j < columns && studentID <= 20; j++) { // row every column
                int x = getRandomBetween(0, rows);
                int y = getRandomBetween(0, columns);
                while (!isCoordinateTaken(x, y)) {
                    x = getRandomBetween(0, rows);
                    y = getRandomBetween(0, columns);
                }
                hall[x][y] = studentID;
                studentID++;
            }
        }
        for (int[] i : hall) {
            System.out.println(Arrays.toString(i));
        }
    }
}
