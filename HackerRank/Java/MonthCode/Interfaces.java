import java.util.Scanner;

/**
 * AdvancedArithmetic
 */
interface AdvancedArithmetic {
    int divisorSum(int n);
}

public class Interfaces implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum + n;
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n >= 1 && n <= 1000) {
            AdvancedArithmetic ar = new Interfaces();
            System.out.println("I implemented: " + ar.getClass().getInterfaces()[0].getName());
            System.out.println(ar.divisorSum(n));
        }
    }
}
