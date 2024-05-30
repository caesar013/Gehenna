import java.io.*;

public class StringtoInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            System.out.println(Integer.parseInt(S));
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}