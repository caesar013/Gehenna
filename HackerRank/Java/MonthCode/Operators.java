package HackerRank.MonthCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double cost_meal = Double.parseDouble(bf.readLine().trim());
        int tip_precent = Integer.parseInt(bf.readLine().trim());
        int tax_precent = Integer.parseInt(bf.readLine().trim());
        Result.solve(cost_meal, tip_precent, tax_precent);
        bf.close();
    }
}
class Result{
    public static void solve(double cost_meal, int tip_percent, int tax_percent){
        double a = cost_meal * tip_percent / 100;
        double b = cost_meal * tax_percent / 100;
        int cost = (int) Math.round(cost_meal +  a + b);
        System.out.println(cost);
    }
}