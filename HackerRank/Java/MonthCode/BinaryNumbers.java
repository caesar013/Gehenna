import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinaryNumbers{
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(b.readLine().trim());

        if (n >= 1 && n <= 1_000_000) {
            System.out.println(countOnes(n));    
        }

        b.close();
    }

    private static int countOnes(int n) {
        String binary = turnIntoBinary(n);
        String[] ones = binary.split("0+");
        return getMax(ones);
    }

    private static int getMax(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > max) {
                max = str[i].length();
            }
        }
        return max;
    }

    private static String turnIntoBinary(int n) {
        return processBinary(n, "");
    }

    private static String processBinary(int n, String s) {
        if (n < 2) {
            return n + s;
        } else {
           return processBinary(n/2, Integer.toString(n%2) + s);
        }
    }
}