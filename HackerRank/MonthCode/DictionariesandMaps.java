package HackerRank.MonthCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DictionariesandMaps  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hm = new HashMap<String, String>();
        String [] str = new String[2];
        System.out.println("How are you? ");
        String s = bf.readLine().trim();
        str = s.split(" ");
        hm.put(str[0], str[1]);
        System.out.println(hm.get(s));
        bf.close();
    }
}
