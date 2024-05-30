package HackerRank.Java.Challenges;

import java.util.Scanner;

public class JStringIntroduction {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(sumLength(a, b));
        System.out.println(compare(a, b));
        System.out.println(capitalize(a, b));
        s.close();
    }

    public static int sumLength(String a, String b) {
        return a.length() + b.length();
    }

    public static String compare(String a, String b) {
        int x = a.compareTo(b);
        if (x < 0 || x == 0) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public static String capitalize(String a, String b) {
        String a1 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String b1 = b.substring(0, 1).toUpperCase() + b.substring(1);
        return a1 + " " + b1;
    }
}
