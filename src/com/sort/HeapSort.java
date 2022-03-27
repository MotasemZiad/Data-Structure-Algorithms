package com.sort;


public class HeapSort {
    private static int total;

    public static void main(String[] args) {

        int[] arr = {1, 7, 13, 5, 3, 23, 76, 94, 33};
        System.out.println("Before Sorting");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println("\nAfter Sorting");
        preSort(arr);
        for (int x: arr) {
            System.out.print(x + "\t");
        }
    }

    private static void heapify(int[] arr, int parentIndex) {
        int leftNodeIndex = parentIndex * 2;
        int rightNodeIndex = parentIndex * 2 + 1;
        int newIndex = parentIndex;
        if (leftNodeIndex < total && arr[leftNodeIndex] > arr[parentIndex]) {
            newIndex = leftNodeIndex;
        }
        if (rightNodeIndex < total && arr[rightNodeIndex] < arr[parentIndex]) {
            newIndex = rightNodeIndex;
        }
        if (newIndex != parentIndex) {
            swap(arr, parentIndex, newIndex);
            heapify(arr, newIndex);
        }

    }

    private static void swap(int[] arr, int parentIndex, int newIndex) {
        int temp = arr[parentIndex];
        arr[parentIndex] = arr[newIndex];
        arr[newIndex] = temp;
    }

    private static void preSort(int arr[]) {
        total = arr.length - 1;
        for (int i = total / 2; i >= 0; i--) {
            heapify(arr, i);
        }
        for (int i = total / 2; i >= 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }
}
