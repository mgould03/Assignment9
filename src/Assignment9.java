public class Assignment9 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Assignment9 <N>");
            System.exit(1);
        }
        int N = Integer.parseInt(args[0]);
        if (N <= 0) {
            System.out.println("Please provide a positive integer.");
            System.exit(1);
        }
        System.out.print("Fibonacci series up to " + N + ": ");
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
