package SoloLearn;
class Methods {
    static void sayHello() {
        System.out.println("Hello World !");
    }

    public static void main(String[] args) {
        /*
         * Methods define behavior. A method is a collection of statements that are
         * grouped together to perform an operation. System.out.println() is an example
         * of a method. You can define your own methods to perform your desired tasks.
         */
        // Let's consider the following code:

        /**
         * class MyClass { static void sayHello() { System.out.println("Hello World !");
         * } public static void main(String[] args) { sayHello(); } }
         */

        sayHello();
        // The code above declares a method called "sayHello", which prints a text, and
        // then gets called in main.
        // To call a method, type its name and then follow the name with a set of
        // parentheses.

        /**
         * You can call a method as many times as necessary. When a method runs, the
         * code jumps down to where the method is defined, executes the code inside of
         * it, then goes back and proceeds to the next line.
         */

        // example :
        /**
         * class MyClass { static void sayHello() { System.out.println("Hello World !");
         * } public static void main(String[] args) { sayHello(); sayHello();
         * sayHello(); } }
         */
        sayHello();
        sayHello();
        sayHello();
        // or
        for (int i = 0; i < 3; i++) {
            sayHello();
        }
        // In cases like the one above, where the same thing is repeated over and over,
        // you can achieve the same result using loops (while or for).

        /**
         * You can also create a method that takes some data, called parameters, along
         * with it when you call it. Write parameters within the method's parentheses.
         * For example, we can modify our sayHello() method to take and output a String
         * parameter.
         */

        sayHello2("Apip");

        /**
         * The method above takes a String called name as a parameter, which is used in
         * the method's body. Then, when calling the method, we pass the parameter's
         * value inside the parentheses.
         */
        // Methods can take multiple, comma-separated parameters.

        /**
         * The advantages of using methods instead of simple statements include the
         * following: - code reuse: You can write a method once, and use it multiple
         * times, without having to rewrite the code each time. - parameters: Based on
         * the parameters passed in, methods can perform various actions.
         */
    }

    static void sayHello2(String name) {
        System.out.println("Hello " + name);
    }
}