package HackerRank.MonthCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DictionariesandMaps  {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();
        
        String s = "";
        int loop = Integer.parseInt(bf.readLine().trim());
        // I don't even know why there has to be a try-catch block
        // but one thing is sure that if there's none, it'll encounter runtime error
        try {
            for (int i = 0; i < loop; i++) {
                s = bf.readLine().trim();
                addDictionary(map, s);
            }
            for (int i = 0; i < loop; i++) {
                s = bf.readLine().trim();
                System.out.println(searchDictionary(map, s));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        bf.close();
    }

    private static void addDictionary(Map<String, String> map, String s){
        String [] str = s.split(" ");
        map.put(str[0], str[1]);
    }

    private static String searchDictionary(Map<String, String> map, String key){
        if (map.get(key) == null) {
            return "Not found";
        } else {
            return key + "=" + map.get(key);
        }
    }
}