import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class TwoDArrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList()));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> hg = new ArrayList<Integer>();

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                int temp = arr.get(r).get(c) + // (0,0)
                        arr.get(r).get(c + 1) + // (0,1)
                        arr.get(r).get(c + 2) + // (0,2)
                        arr.get(r + 1).get(c + 1) + // (1,1)
                        arr.get(r + 2).get(c) + // (2,0)
                        arr.get(r + 2).get(c + 1) + // (2,1)
                        arr.get(r + 2).get(c + 2); // (2,2)
                hg.add(temp);
            }
        }

        hg.sort(null);

        System.out.println(hg.get(15));

        bufferedReader.close();
    }
}
