package SoloLearn;
class helloWorld {
    // this one is called ~class~

    /*
     * In Java, every line of code that can actually run needs to be inside a
     * ~class~. In our example, we named the class helloWorld.
     */

    // To run our program, the ~main~ method must be identical to this one!
    public static void main(String[] args) {

        /*
         * In Java, each application has an entry point, or a starting point, which is a
         * method called ~main~.
         */

        /*****************************************************************
         * meaning ~pubic~ means anyone can access it. ~static~ means method can be run
         * without creating an instance of the class containing the main method ~void~
         * means method doesn't return any value. ~main~ means the name of the method.
         *****************************************************************/
        // NOTE : for ~main~, it's an array of Strings called ~args~.

        /*
         * Summary //1. Every program in Java must have a ~class~. //2. Every Java
         * program starts from the ~main~ method.
         */
        System.out.println("Hello World");
        // In Java, each code statement must end with a ~semicolon~ (;).
    }
}