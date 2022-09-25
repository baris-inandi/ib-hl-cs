package out;

public class Out {
    public static void main(String[] args) {
        int birthYear = 1998;
        int currentYear = 2022;
        String msg = String.format("You are %d years old", currentYear - birthYear);
        System.out.println(msg);
    }
}