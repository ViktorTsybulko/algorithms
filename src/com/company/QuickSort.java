package com.company;

/* Quick sort
 * Algorithm complexity:
 *
 * Worst-case O(n^2)
 * Best-case O(n*log n)
 * Average O(n*log n)
 */

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, -34, 25, 12, 22, 11, 90, -2};
        System.out.println(Arrays.toString(arr));

        int n = arr.length;

        sort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high)
    {

        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void sort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}