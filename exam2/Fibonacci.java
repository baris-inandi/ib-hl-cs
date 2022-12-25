class Fibonacci {

    // recursion study

    public static int fib(int n) {
        return n <= 2
                ? 1
                : fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}