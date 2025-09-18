package com.SiddhantBhatia.DAY_41;

import java.util.Arrays;

public class Deletion_In_Arrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 25, 30, 40};
        int n = 5;
        int pos = 2; // Index to delete (value 25)
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i+1]; // Shift left
        }
        n--;
        System.out.println(Arrays.toString(arr));
    }
}
