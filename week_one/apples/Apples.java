package apples;

import java.util.*;

public class Apples {
    public static void main(String[] args) {
        List<Integer> appleWeights = Arrays.asList(200, 300, 420, 129, 482, 847, 182, 123, 495, 301);
        int price = 2;
        int weight = 0;
        for (int i = 0; weight < 2000; i++) {
            weight += appleWeights.get(i);
        }
        System.out.println("Pay " + weight * price + "TL for " + weight + " grams of apples.");
    }
}
