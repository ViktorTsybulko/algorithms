package com.company;

/* Insertion sort
 * Algorithm complexity: O(n^2)
 *
 * Insertion sort iterates, consuming one input element each repetition,
 * and grows a sorted output list. At each iteration,
 * insertion sort removes one element from the input data,
 * finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 *
 * Sorting is typically done in-place, by iterating up the array,
 * growing the sorted list behind it. At each array-position,
 * it checks the value there against the largest value in the sorted list
 * (which happens to be next to it, in the previous array-position checked).
 * If larger, it leaves the element in place and moves to the next.
 * If smaller, it finds the correct position within the sorted list,
 * shifts all the larger values up to make a space,
 * and inserts into that correct position.
 */

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, -34, 25, 12, 22, 11, 90, -2};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}