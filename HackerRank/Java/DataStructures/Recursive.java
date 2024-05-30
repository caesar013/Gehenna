package HackerRank.Java.DataStructures;

public class Recursive {

    public static int summation(int n) {
        // base case
        if (n <= 0) {
            return 0;
            // recursive case
        } else {
            return n + summation(n - 1);
        }
    }

    public static int factorial(int f) {
        // base case
        if (f == 1) {
            return 1;
            // recursive case
        } else {
            return f * factorial(f - 1);
        }
    }

    public static int exponentiation(int n, int e) {
        // base case
        if (e <= 0) {
            return 1;
            // recursive case
        } else {
            return n * exponentiation(n, e - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(summation(5));
        System.out.println(factorial(5));
        System.out.println(exponentiation(2, 8));
    }
}
