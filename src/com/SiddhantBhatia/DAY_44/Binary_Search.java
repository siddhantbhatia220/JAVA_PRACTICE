package com.SiddhantBhatia.DAY_44;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    static int BinarySearch(int [] arr , int left , int right , int target)
    {
        if ( left > right)
            return -1;
        int mid = ( left + right )/2;
        if (arr[mid] == target)
            return mid;
        else if(arr[mid]>target)
            return BinarySearch(arr , left , mid -1 , target);
        else
            return BinarySearch(arr , mid + 1 , right , target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        System.out.print("Enter the target element to search : ");
        int target = sc.nextInt();
        int result = BinarySearch(arr, 0,  n - 1, target);
        if (result != -1)
        {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    }


//public class Binary_Search {
//
//    /**
//     * Performs a binary search on a sorted integer array.
//     *
//     * @param arr The sorted integer array to search.
//     * @param target The integer value to search for.
//     * @return The index of the target value if found, otherwise -1.
//     */
//    public static int Binary_Search(int[] arr, int target) {
//        // Initialize the search range
//        int left = 0;
//        int right = arr.length - 1;
//
//        // Loop as long as the search range is valid
//        while (left <= right) {
//            // Calculate the middle index
//            // Using `left + (right - left) / 2` prevents potential integer overflow
//            // that could occur with `(left + right) / 2` if left and right are very large
//            int mid = left + (right - left) / 2;
//
//            // Check if the middle element is the target
//            if (arr[mid] == target) {
//                return mid; // Target found, return its index
//            }
//
//            // If the middle element is less than the target,
//            // discard the left half and search the right half
//            if (arr[mid] < target) {
//                left = mid + 1;
//            }
//            // If the middle element is greater than the target,
//            // discard the right half and search the left half
//            else {
//                right = mid - 1;
//            }
//        }
//
//        // If the loop finishes, the target was not found
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
//        int target1 = 23;
//        int target2 = 7;
//
//        // Search for a value that is in the array
//        int index1 = Binary_Search(sortedArray, target1);
//        if (index1 != -1) {
//            System.out.println("Element " + target1 + " found at index " + index1);
//        } else {
//            System.out.println("Element " + target1 + " not found in the array.");
//        }
//
//        // Search for a value that is not in the array
//        int index2 = Binary_Search(sortedArray, target2);
//        if (index2 != -1) {
//            System.out.println("Element " + target2 + " found at index " + index2);
//        } else {
//            System.out.println("Element " + target2 + " not found in the array.");
//        }
//    }
//}
