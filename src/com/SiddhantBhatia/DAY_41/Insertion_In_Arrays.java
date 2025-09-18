package com.SiddhantBhatia.DAY_41;

import java.util.Arrays;
public class Insertion_In_Arrays {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 0};
        int n = 4;
        int value = 25;
        int pos = 2;
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i-1]; // Shift right
        }
        arr[pos] = value;
        n++;
        System.out.println(Arrays.toString(arr)); // [10, 20, 25, 30, 40]
    }
}
