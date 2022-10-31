package exam_study;

public class ReversePrint {
    public static void main(String[] args) {
        String x = "Hello World!";
        for (int i = x.length(); i == 0; i--) {
            System.out.print(x.charAt(i));
        }
    }

}
