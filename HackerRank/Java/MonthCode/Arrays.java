import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;

public class Arrays{
    public static void main(String [] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine().trim());

        if (n >= 1 && n <= 1000) {
            String[] input = bf.readLine().split(" ");
            int[] arr = new int[input.length];
            int temp = 0;
            // keep the array into an actual Integer array and sort things out.
            for (int i = 0; i < input.length; i++) {
                // this try and catch will handle if there's a non-integer value coming in.
                try {
                    temp = Integer.parseInt(input[i]);
                    if (temp >= 1 && temp <= 10000) {
                        arr[i] = temp;
                    } else {
                        continue;                        
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }
            // we'll iterate through the array in reverse order
            for (int i = input.length - 1; i > 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[0]);
        } else {
            bf.close();
        }
    }
}