import java.util.Scanner;

public class MembalikKalimat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        scanner.close();

        // your code goes here
        /**
         * Write a program to take a string as input and output its reverse. The given
         * code takes a string as input and converts it into a char array, which
         * contains letters of the string as its elements.
         */

        int length = arr.length;
        length--;
        for (; 0 <= length; length--) {
            System.out.print(arr[length]);
        }
    }
}