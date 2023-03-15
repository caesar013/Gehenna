package SoloLearn.Java;
import java.util.Scanner;

class SwitchStatement {
    public static void main(String[] args) {
        Scanner hm = new Scanner(System.in);
        /**
         * A switch statement tests a variable for equality against a list of values.
         * Each value is called a case, and the variable being switched on is checked
         * for each case.
         */

        /**
         * - When the variable being switched on is equal to a case, the statements
         * following that case will execute until a break statement is reached. - When a
         * break statement is reached, the switch terminates, and the flow of control
         * jumps to the next line after the switch statement. - Not every case needs to
         * contain a break. If no break appears, the flow of control will fall through
         * to subsequent cases until a break is reached.
         */
        // the example below tests day againts a set of values and prints a
        // corresponding message
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please reinput within 1-7 range!");
                // please remember that 'break' isn't needed in the default case.
        }

        System.out.print("please enter a number (1-12) : ");
        int month = hm.nextInt();
        String dayType = switch (month) {
            case 4, 5, 6 -> "Spring time!";
            case 7, 8, 9 -> "Summer time!";
            case 10, 11, 12 -> "Fall time!";
            case 1, 2, 3 -> "Winter time!";
            default -> "Please reinput within 1-12 range!";
        };
        System.out.printf("The event will be held at %d in %s", day, dayType);
        hm.close();

        // You can have any number of case statements within a switch. Each case is
        // followed by the comparison value and a colon.

    }
}