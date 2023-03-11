package HackerRank.MonthCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Review {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine().trim());
        if (t >= 1 && t <= 10) {
            while (t-- > 0) {
                String s = bf.readLine().trim();
                stringProcess(s);
            }
        } else {
            bf.close();
        }
    }
    
    private static void stringProcess(String s){
        int ls = s.length();
        if (ls >= 2 && ls <= 10000) {
            String str = "";
            int i = 0;
            while (i < ls) {
                System.out.print(s.charAt(i));
                try {
                    str += s.charAt(i+1);
                } catch (IndexOutOfBoundsException e) {
                    // do nothing cause I just want the code to ignore the odd-length word
                }
                i += 2;
            }
            System.out.println(" " + str);
        }
    }
}
