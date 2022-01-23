package com.company;

import java.util.Arrays;

/* Heap sort
 * Algorithm complexity: O(n*log n)
 *
 * Algorithm
 *
 * 1)Build a max heap from the input data.
 *
 * 2)At this point, the largest item is stored at the root of the heap.
 * Replace it with the last item of the heap followed by reducing the size of heap by 1.
 * Finally, heapify the root of the tree.
 *
 * 3)Repeat step 2 while the size of the heap is greater than 1.
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {64, -34, 25, 12, 22, 11, 90, -2};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr)
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
