package SoloLearn;
import java.util.Scanner;

class LogicalStatements {
    public static void main(String[] args) {
        Scanner nd = new Scanner(System.in);
        /**
         * Logical operators are used to combine multiple conditions.
         * 
         * Let's say you wanted your program to output "Welcome!" only when the variable
         * age is greater than 18 and the variable money is greater than 500. One way to
         * accomplish this is to use nested if statements:
         */
        int age, money;
        System.out.print("How old are you ?  ");
        age = nd.nextInt();
        System.out.print("How much money do you have ?  ");
        money = nd.nextInt();

        // AND Operator
        if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome!");
            }
        }

        // However, using the AND logical operator (&&) is a better way:
        if (age > 18 && money > 500) {
            System.out.println("\nWelcome!!");
        }
        // NOTE If both operands(age > 18 AND money > 500) of the AND operator are true,
        // then the condition becomes true.
        int age1, money1;
        System.out.print("How old are you ?  ");
        age1 = nd.nextInt();
        System.out.print("How much money do you have ?  ");
        money1 = nd.nextInt();

        // OR Operator
        if (age1 > 18 || money1 > 500) {
            System.out.println("Welcome!");
        }
        // The code above will print "Welcome!" if age is greater than 18 or if money is
        // greater than 500.

        // NOT Operator
        /**
         * The NOT !) logical operator is used to reverse the logical state of its
         * operand. If a condition is true, the NOT logical operator will make it false.
         */
        if (!(age1 > 18)) {
            System.out.println("Too young");
        } else {
            System.out.println("Welcome!");
        }
        // !(age > 18) reads as "if age is NOT greater than 18".
        nd.close();
    }
}