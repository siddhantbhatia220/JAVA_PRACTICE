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

