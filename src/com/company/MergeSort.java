package com.company;

import java.util.Arrays;

/* Merge sort
 * Algorithm complexity: O(n*log n)
 * Algorithm
 * Conceptually, a merge sort works as follows:
 *
 * 1)Divide the unsorted list into n sublist,
 * each containing one element (a list of one element is considered sorted).
 *
 * 2)Repeatedly merge sublist to produce new sorted sublist until there is only one sublist remaining.
 * This will be the sorted list.
 */

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {64, -34, 25, 12, 22, 11, 90, -2};
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }


    private static void merge(int[] arr, int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];


        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r)
    {
        if (l < r) {
            int m =l+ (r-l)/2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }
}
