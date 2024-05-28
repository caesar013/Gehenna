import java.io.IOException;
import java.lang.Integer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecursionFactorial{
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(b.readLine().trim());
        if (input >= 2 && input <= 12) {
            System.out.println(facRecursion(input));
        } else {
            System.out.println(0);
        }
        b.close();
    }

    private static int facRecursion(int n){
        if (n == 1) {
            return 1;
        } else {
            return n * facRecursion(n-1);
        }
    }
}