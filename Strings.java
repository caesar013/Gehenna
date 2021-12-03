class Strings {
    public static void main(String[] args) {
        /**
         * A String is an object that represents a sequence of characters. For example,
         * "Hello" is a string of 5 characters.
         */
        String s = "Hello";
        // NOTE we can define an empty string, String str = "";

        /**
         * The + (plus) operator between strings adds them together to make a new
         * string. This process is called concatenation. The resulted string is the
         * first string put together with the second string.
         */
        String firstName, lastName;
        firstName = "David";
        lastName = "Williams";
        System.out.println(s + " my name is " + firstName + " " + lastName);
    }
}