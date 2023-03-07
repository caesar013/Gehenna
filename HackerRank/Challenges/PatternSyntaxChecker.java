package HackerRank.Challenges;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        s.nextLine();
        while (x-- > 0) {
            String str = s.nextLine();
            try {
                Pattern p = Pattern.compile(str);
                System.out.println("Valid");
            } catch (PatternSyntaxException a) {
                System.out.println("Invalid");
            }
        }
        s.close();
    }
}