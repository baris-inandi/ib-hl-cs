package pythagoras;

public class Pythagoras {
    public static void main(String[] args) {
        double y1 = 10;
        double y2 = 20;
        double x1 = 30;
        double x2 = 40;
        double distance = Math.sqrt(
                Math.pow(
                        y1 - y2, 2)
                        + Math.pow(
                                x1 - x2, 2));
        System.out.println(distance);
    }
}