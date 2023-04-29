package SoloLearn.Java;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class CreatingFiles {
    /*
     * 
     * Formatter, another useful class in the java.util package, is used to create
     * content and write it to files.
     * 
     * import java.util.Formatter;
     * 
     * public class MyClass {
     * public static void main(String[ ] args) {
     * try {
     * Formatter f = new Formatter("C:\\sololearn\\test.txt");
     * } catch (Exception e) {
     * System.out.println("Error");
     * }
     * }
     * }
     * 
     * This creates an empty file at the specified path. If the file already exists,
     * this will overwrite it.
     * 
     * Again, you need to surround the code with a try/catch block, as the operation
     * can fail.
     * 
     * 
     * Once the file is created, you can write content to it using the same
     * Formatter object's format() method.
     * 
     * import java.util.Formatter;
     * 
     * public class MyClass {
     * public static void main(String[ ] args) {
     * try {
     * Formatter f = new Formatter("C:\\sololearn\\test.txt");
     * f.format("%s %s %s", "1","John", "Smith \r\n");
     * f.format("%s %s %s", "2","Amy", "Brown");
     * f.close();
     * } catch (Exception e) {
     * System.out.println("Error");
     * }
     * }
     * }
     * 
     * The format() method formats its parameters according to its first parameter.
     * 
     * %s mean a string and get's replaced by the first parameter after the format.
     * The second %s get's replaced by the next one, and so on. So, the format %s %s
     * %s denotes three strings that are separated with spaces.
     * 
     * Note: \r\n is the newline symbol in Windows.
     * 
     * ---
     * 1 John Smith
     * 2 Amy Brown
     * ---
     * 
     * Don't forget to close the file once you're finished writing to it!
     * 
     * 
     * You want to plan your day and create your to do list.
     * 
     * Complete the program to take the names of 3 tasks as input and write them
     * down in the file "tasks.txt", each on a new line.
     * 
     * Then use the readFile() method to output the tasks.
     * 
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            Formatter f = new Formatter("D:\\Gehenna\\SoloLearn\\Java\\tasks.txt");
            int count = 0;
            while (count < 3) {
                // your code goes here
                f.format("%s \n", input.nextLine());
                count++;
            }
            readFile();
            input.close();
            f.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("D:\\Gehenna\\SoloLearn\\Java\\tasks.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
