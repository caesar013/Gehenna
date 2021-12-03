
/*While Java provides many different methods for getting user input, 
the Scanner object is the most common, and perhaps the easiest to implement. 
Import the Scanner class to use the Scanner object
*/
import java.util.Scanner;

class GettingUserInput {
    public static void main(String[] args) {
        /**
         * In order to use the Scanner class, create an instance of the class by using
         * the following syntax:
         */
        Scanner myVar = new Scanner(System.in);
        /**
         * You can now read in different kinds of input data that the user enters. Here
         * are some methods that are available through the Scanner class: Read a byte -
         * nextByte() Read a short - nextShort() Read an int - nextInt() Read a long -
         * nextLong() Read a float - nextFloat() Read a double - nextDouble() Read a
         * boolean - nextBoolean() Read a complete line - nextLine() Read a word -
         * next()
         */
        System.out.println(myVar.nextLine());
        // this syntax above will require input from the user and then print it again.
        // The whole text.

        // these syntax below will explain how to require an integer input and print it
        int angka;
        System.out.print("Masukkan angka : ");
        angka = myVar.nextInt();
        System.out.println("Print angka input : " + angka);

        // this syntax below will close myVar variable in the first Scanner syntax.
        myVar.close();
    }
}