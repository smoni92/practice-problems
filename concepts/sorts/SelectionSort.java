package concepts.sorts;

import java.util.Arrays;

public class SelectionSort {

    // In-Place Sorting
    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            swap(arr, min_index, i);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int arr[] = {64, 25, 12, 22, 11};

        System.out.println("Original Array :  " + Arrays.toString(arr));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        System.out.println("After Selection Sort: " + Arrays.toString(arr));
    }

}
