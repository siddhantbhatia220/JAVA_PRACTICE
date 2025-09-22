package com.SiddhantBhatia.DAY_45;

import java.util.Scanner;

public class SumOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < num; j++)
            {
        sum += arr[i][j];
    }
        }
        System.out.println(sum);

    }
}
