package com.main;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != 1) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Array: ");
        for (double l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
        System.out.println("Array last sort: ");
        selectionSort(list);
        for (double l : list) {
            System.out.print(l + " ");
        }
    }
}
