package com.SiddhantBhatia.DAY_45;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for (int i = 0; i<num;i++)
        {
            arr[i] = sc.nextInt();
        }
        int target =  sc.nextInt();
        for (int i = 0; i<num;i++)
        {
            if (arr[i] ==target)
            {
                System.out.println("Found at index " + i);
            }

        }
    }
}
