package SoloLearn;
class DoWhileLoops {
    public static void main(String[] args) {
        /**
         * A do...while loop is similar to a while loop, except that a do...while loop
         * is guaranteed to execute at least one time.
         */
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x < 5);
        /**
         * 1 2 3 4 Notice that the condition appears at the end of the loop, so the
         * statements in the loop execute once before it is tested. Even with a false
         * condition, the code will run once.
         */
        x = 1;
        do {
            System.out.println(x);
            ++x;
        } while (x < 0);
        // 1
        // Notice that in do…while loops, the while is just the condition and doesn't
        // have a body itself.

        /**
         * The break and continue statements change the loop's execution flow. The break
         * statement terminates the loop and transfers execution to the statement
         * immediately following the loop.
         */
        x = 1;
        while (x > 0) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            ++x;
        }
        /**
         * output 1 2 3 4
         */

        /**
         * The continue statement causes the loop to skip the remainder of its body and
         * then immediately retest its condition prior to reiterating. In other words,
         * it makes the loop skip to its next iteration.
         */
        for (int y = 10; y <= 40; y += 10) {
            if (y == 30) {
                continue;
            }
            System.out.println(y);
        }
        /**
         * output 10 20 40 As you can see, the above code skips the value of 30, as
         * directed by the continue statement.
         */
    }
}