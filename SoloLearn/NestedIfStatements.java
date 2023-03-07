package SoloLearn;
import java.util.Scanner;

class NestedIfStatements {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        // You can use one if-else statement inside another if or else statement.
        int age = 25;
        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too young.");
            }
        } else {
            System.out.println("Error");
        }
        // we can put nested-if as many as we want as long as the syntax is arranged
        // correctly
        // example
        System.out.print("Is the match suspended (true or false) ? ");
        boolean sus = util.nextBoolean();
        if (sus == true) {
            System.out.println("\n\tThe match is Suspended\n");
        } else {
            System.out.print("\n\nOur score is\t\t: ");
            int ourScore = util.nextInt();
            System.out.print("Their Score\t\t: ");
            int theirScore = util.nextInt();

            // logic
            if (ourScore > theirScore) {
                System.out.println("\n\tWe Won!\n");
            } else if (ourScore == theirScore) {
                System.out.println("\n\tIt's a Draw\n");
            } else if (ourScore < theirScore) {
                System.out.println("\n\tWe Lost!\n");
            } else {
                System.out.println("Error! \nWrong Input!!!");
            }
        }
        util.close();
    }
}