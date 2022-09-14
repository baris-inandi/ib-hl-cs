package fib;

import java.util.*;

class Fib {
    public static List<Integer> fib(int threshold) {
        if (threshold <= 0) {
            return Collections.emptyList();
        }
        List<Integer> initial = Arrays.asList(1, 1);
        if (threshold == 1) {
            return initial;
        }
        List<Integer> l = new ArrayList<>(initial);
        while (l.get(l.size() - 1) <= threshold) {
            l.add(l.get(l.size() - 1) + l.get(l.size() - 2));
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(fib(10 ^ 1000000000));
    }
}