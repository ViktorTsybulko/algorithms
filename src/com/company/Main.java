package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bubble sort");
        int[] bubbleArr = {1, 12, -4, 5, 16, 1, 0, -13};
        BubbleSort.sort(bubbleArr);
        System.out.println(Arrays.toString(bubbleArr));

        System.out.println("Insertion sort");
        int[] insertionArr = {1, 12, -4, 5, 16, 1, 0, -13};
        InsertionSort.sort(insertionArr);
        System.out.println(Arrays.toString(insertionArr));

    }
}
