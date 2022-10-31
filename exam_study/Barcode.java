package exam_study;

public class Barcode {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            int barcode = (int) (Math.random() * Math.pow(10, 13));
            System.out.println(barcode);
        }
    }
}
