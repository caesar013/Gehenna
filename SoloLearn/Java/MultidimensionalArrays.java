package SoloLearn.Java;
class MultidimensionalArrays {
    public static void main(String[] args) {

        /**
         * Multidimensional arrays are array that contain other arrays. The
         * two-dimensional array is the most basic multidimensional array. To create
         * multidimensional arrays, place each array within its own set of square
         * brackets.
         */

        int[][] sample = { { 1, 2, 3 }, { 4, 5, 6 } };

        /**
         * This declares an array with two arrays as its elements. To access an element
         * in the two-dimensional array, provide two indexes, one for the array, and
         * another for the element inside that array. The following example accesses the
         * first element in the second array of sample.
         */

        int x = sample[1][0];
        System.out.println(x);

        // NOTE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // The array's two indexes are called row index and column index.

        /**
         * You can get and set a multidimensional array's elements using the same pair
         * of square brackets.
         */

        int[][] myArr = { { 1, 2, 3 }, { 4 }, { 5, 6, 7 } };
        myArr[0][2] = 42;
        int z = myArr[1][0], y = myArr[0][2];
        System.out.println(y); // 42
        System.out.println(z); // 4

        /**
         * The above two-dimensional array contains three arrays. The first array has
         * three elements, the second has a single element and the last of these has
         * three elements.
         */

        /**
         * In Java, you're not limited to just two-dimensional arrays. Arrays can be
         * nested within arrays to as many levels as your program needs. All you need to
         * declare an array with more than two dimensions, is to add as many sets of
         * empty brackets as you need. However, these are harder to maintain. Remember,
         * that all array members must be of the same type.
         */

        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = i;
        }
        int res = arr[0] + arr[2];
        System.out.println(res);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }

        System.out.println(result);
    }
}