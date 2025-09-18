package com.SiddhantBhatia.DAY_42;

import java.util.Scanner;

public class PrintFirstAndLastRow {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            int[][] array = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                if (i==0 || i==n-1)
                {
                    for (int j = 0; j < n; j++)
                    {
                        System.out.println(array[i][j]+" ");
                    }
                    System.out.println();
                }

            }
        }
    }


