package SoloLearn.Java;
class MathOperators {
    public static void main(String[] args) {

        // Java provides a rich set of operators to use in manipulating variables. A
        // value used on either side of an operator is called an operand.
        // For example, in the expression below, the numbers 6 and 3 are operands of the
        // plus operator:
        int x = 6 + 3;
        /*
         * Java arithmetic operators: + addition - subtraction multiplication / division
         * % modulo(will show the rest of the devision's result. 3%2=1)
         */

        // Addition
        // The + operator adds together two values, such as two constants, a constant
        // and a variable, or a variable and a variable.
        int sum1 = 50 + 10;
        int sum2 = sum1 + 66;
        int sum3 = sum1 + sum2;
        // Subbstraction, multiplication, and division have the same way of operating as
        // Addition

        // The modulo (or remainder) math operation performs an integer division of one
        // value by another, and returns the remainder of that division.
        // The operator for the modulo operation is the percentage (%) character.

        // NOTE : we can operate multiple operations in a line
        // ex : int penjumlahan = 10 + 3 - 6;

        System.out.println("hasil penjumlahan adalah " + sum3);
        System.out.println("contoh penjumlahan " + x);
    }
}