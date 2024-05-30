import java.io.*;

public class MoreExceptions {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        // Task
        // Write a Calculator class with a single method: int power(int,int). The power
        // method takes two integers,n and p, as parameters and returns the integer
        // result
        // of n to the power of p. If either n or p is negative, then the method must
        // throw an exception with
        // the message: n and p should be non-negative.

        // Note: Do not use an access modifier (e.g.: public) in the declaration for
        // your Calculator class.
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Calculator calc = new Calculator();
        int n = 0, p = 0;
        try {
            int i = Integer.parseInt(b.readLine());
            while (i-- > 0) {
                String s = b.readLine();
                String[] intArr = s.split(" ");
                n = Integer.parseInt(intArr[0]);
                p = Integer.parseInt(intArr[1]);
                try {
                    System.out.println(calc.power(n, p));
                } catch (IllegalArgumentException e) {
                    // TODO: handle exception
                    // print the message from the exception thrown from power method
                    System.out.println(e.getMessage());
                }
            }
            b.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

class Calculator {
    int power(int n, int p) throws IllegalArgumentException {
        if (n < 0 || p < 0) {
            // throw exception message to catch block
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}