package com.SiddhantBhatia.DAY_44;

import java.util.Arrays;
import java.util.Scanner;

public class Diagonal_Product {
    public static void main(String[] args) {
        int product=1;
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        for (int i = 0;i<rows;i++)
        {
            for(int j=0;j<cols;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) {
                    product *= arr[i][j];
                }

            }
        }
        for (int i = 0;i<rows;i++) {
            for ( int j = 0; j < cols; j++) {
                if (i == j) {
                    arr[i][j]=product;

                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println();
    }
}
