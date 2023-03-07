package SoloLearn;
class ConditionalStatements {
    public static void main(String[] args) {
        /**
         * Conditional statements are used to perform different actions based on
         * different conditions. The if statement is one of the most frequently used
         * conditional statements. If the if statement's condition expression evaluates
         * to true, the block of code inside the if statement is executed. If the
         * expression is found to be false, the first set of code after the end of the
         * if statement (after the closing curly brace) is executed.
         */
        /**
         * Any of the following comparison operators may be used to form the condition:
         * //< less than //> greater than //!= not equal to //== equal to //<= less than
         * or equal to //>= greater than or equal to
         */

        int x = 7;
        if (x < 42) {
            System.out.println("Hi it's " + x);
        }
        /**
         * An if statement can be followed by an optional else statement, which executes
         * when the condition evaluates to false.
         */
        int age = 30;
        if (age < 16) {
            System.out.println("Too young");
        } else {
            System.out.println("Welcome!");
        }
    }
}