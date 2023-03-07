package SoloLearn;
class Increment_Decreament {
    public static void main(String[] args) {
        /**
         * An increment or decrement operator provides a more convenient and compact way
         * to increase or decrease the value of a variable by one. For example, the
         * statement x=x+1; can be simplified to ++x
         */

        int test = 4;
        System.out.println(++test); // the value will be displayed after being operated
        // The decrement operator (--) is used to decrease the value of a variable by
        // one.
        System.out.println(--test);
        System.out.println(test++); // the value will be displayed and then will be operated afterward
        System.out.println("setelah dioperasikan maka akan menjadi " + test);
        System.out.println(test--);
        System.out.println("setelah dioperasikan maka akan menjadi " + test);

        /**
         * Two forms, prefix and postfix, may be used with both the increment and
         * decrement operators. With prefix form, the operator appears before the
         * operand, while in postfix form, the operator appears after the operand. Below
         * is an explanation of how the two forms work:
         */
        /*
         * Prefix: Increments the variable's value and uses the new value in the
         * expression.
         */
        int x = 34;
        int y = ++x;
        System.out.println(y);
        /*
         * The value of x is first incremented to 35, and is then assigned to y, so the
         * values of both x and y are now 35.
         */

        /*
         * Postfix: The variable's value is first used in the expression and is then
         * increased
         */
        int z = 33;
        int a = z++;
        System.out.println(a);
        /*
         * x is first assigned to y, and is then incremented by one. Therefore, x
         * becomes 35, while y is assigned the value of 34.
         */

        /**
         * Java provides a number of assignment operators to make it easier to write
         * code. Addition and assignment (+=):
         */
        int num1 = 4;
        int num2 = 8;
        num2 += num1; // num2 = num1 + num2
        System.out.println("penambahan 4 dan 8 " + num2);
        num2 -= num1; // num2 = num1 - num2
        System.out.println("pengurangan 4 dan 8 " + num2);
    }
}