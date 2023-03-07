package SoloLearn;
class ElementsinArrays {
    public static void main(String[] args) {
        /**
         * You can access the length of an array (the number of elements it stores) via
         * its length property.
         */
        int[] arr = new int[5];
        System.out.println(arr.length);
        /**
         * Don't forget that in arrays, indexes start from 0. So, in the example above,
         * the last index is 4.
         */

        /**
         * Now that we know how to set and get array elements, we can calculate the sum
         * of all elements in an array by using loops. The for loop is the most used
         * loop when working with arrays, as we can use the length of the array to
         * determine how many times to run the loop.
         */
        int[] myArr = { 6, 42, 3, 7 };
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
        // 58
        /**
         * In the code above, we declared a variable sum to store the result and
         * assigned it 0. Then we used a for loop to iterate through the array, and
         * added each element's value to the variable.
         */

        /**
         * NOTE The condition of the for loop is x<myArr.length, as the last element's
         * index is myArr.length-1.
         */

    }
}