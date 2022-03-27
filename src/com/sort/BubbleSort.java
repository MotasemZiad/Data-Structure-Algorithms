package com.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 7, 13, 5, 3, 23, 76, 94, 33};
        System.out.println("Before Sorting");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println("\nAfter Sorting");
        getBubbleSort(arr);
        for (int x : arr) {
            System.out.print(x + "\t");
        }

    }

    // Big-O => O(n^2) "Space and Time consuming .."
    private static void getBubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) { // n-time
            for (int j = 1; j < arr.length ; j++) { // n-time
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
