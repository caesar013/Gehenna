import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine().trim());
        if (i < 2 || i > 20) {
            bf.close();
            System.exit(0);
        }
        for (int j = 1; j < 11; j++) {
            System.out.printf("%d x %d = %d\n", i, j, (i * j));
        }
        bf.close();
    }
}
