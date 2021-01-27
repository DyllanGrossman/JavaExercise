package practiceArrays;

/** A class that contains several methods for manipulating an array of
 * integers.
 */
public class ArrayHelper {

    /** Print all elements of the given array
     *
     * @param arr array of integers
     */
    public static void print(int[] arr) {
        //TODO: Replace with your code.
    }

    /** Find two largest elements of the array in one pass
     *
     * @param arr input array
     * @return an array that contains two largest elements of the input array
     */
    public static int[] findTwoLargest(int[] arr) {
        int[] twoLargest = new int[2];

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        //TODO: Replace with your code.
        // Compute max and secondMax


        return twoLargest;
    }

    /**
     * Returns true if all elements of given array are less then
     * the given threshold, and false otherwise
     * @param arr array of integers
     * @param thres threshold
     * @return
     */
    public static boolean threshold(int[] arr, int thres) {
        //TODO: Replace with your code.
        return false;
    }

    /** Returns the number of occurrences of elem in the given array.
     * Ex: if array is [9, 10, 0, 2, 5, 10, 3] and elem=10, the result is 2
     * @param arr array of integers
     * @param elem integer value
     * @return
     */
    public static int countOccurrences(int[] arr, int elem) {
        //TODO: Replace with your code.
        return 0;
    }

    /**
     * Given two unsorted arrays of integers, returns an array that contains elements that occur in both arrays.
     * For instance, if array1 contains {4, 3, 1} and array2 contains {1, 10, 4}, then your
     * code should return {4, 1}.
     * @param arr1 input array 1
     * @param arr2 input array 2
     */
    public static int[] printIntersection(int[] arr1, int[] arr2) {
        int[] res  = new int[Math.min(arr1.length, arr2.length)];
        //TODO: Replace with your code.

        return res;
    }



}