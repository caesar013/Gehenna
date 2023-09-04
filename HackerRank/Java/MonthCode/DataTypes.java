package HackerRank.MonthCode;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        int i;
        double d;
        String s;
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        input.nextLine();
        double dou = input.nextDouble();
        input.nextLine();
        String st = input.nextLine();
        i = 4;
        d = 4;
        s = "HackerRank";
        i = i + in;
        d = d + dou;
        s = s + " " + st;
        System.out.println(i);
        System.out.printf("%.1f \n", d);
        System.out.println(s);
        input.close();
    }
}
