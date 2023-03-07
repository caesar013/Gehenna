package SoloLearn;
class ForLoops {
    public static void main(String[] args) {
        /**
         * for (initialization; condition; increment/decrement(with any value)) {
         * statements(s) } Initialization: Expression executes only once during the
         * beginning of loop Condition: Is evaluated each time the loop iterates. The
         * loop executes the statement repeatedly, until this condition returns false.
         * Increment/Decrement: Executes after each iteration of the loop.
         */
        for (int x = 1; x <= 5; ++x) {
            System.out.println(x);
        }
        /**
         * This initializes x to the value 1, and repeatedly prints the value of x,
         * until the condition x<=5 becomes false. On each iteration, the statement x++
         * is executed, incrementing x by one.
         */

        /**
         * //NOTE Notice the semicolon (;) after initialization and condition in the
         * syntax.
         */

        // we can have anyy type of condition and any type of increment/decreament
        // statesment in the for loop
        for (int x = 0; x <= 10; x += 2) {
            System.out.println(x);
        }
        // NOTE A for loop is BEST when the starting and ending numbers are known.
    }
}