package com.xiaohub.InsertionSort;

public class Algorithm {

    private Algorithm() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j -1 > 0; j++) {
                if (arr[j].compareTo(arr[j-1]) < 0) {
                    swap(arr, j , j-1);
                }
            }
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        com.xiaohub.selectionsort.Algorithm.sort(arr);
        for (int e : arr) {
            System.out.printf(e + " ");
        }
    }

}
