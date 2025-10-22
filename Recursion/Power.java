package Recursion;

public class Power {
    public static void main(String[] args) {
        int number = 3;
        int power = 3;

        long result = power(number, power);
        System.out.println(result);
    }

    private static long power(int n, int p) {
        if (p == 0) {
            return 1;
        } else {
            return n * power(n, p - 1);
        }
    }
}
