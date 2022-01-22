package com.company;

import java.util.Arrays;

/*  Bubble sort
 *  Algorithm complexity: O(n^2)
 *
 *  The algorithm consists of repeated passes through the sorted array.
 *  For each pass, the elements are sequentially compared in pairs and,
 *  if the order in the pair is incorrect, the elements are permuted.
 */

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {64, -34, 25, 12, 22, 11, 90, -2};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}