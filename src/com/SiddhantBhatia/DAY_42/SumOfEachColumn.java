package com.SiddhantBhatia.DAY_42;

import java.util.Scanner;

public class SumOfEachColumn {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n1 : ");
            int n1 = sc.nextInt();
            System.out.println("Enter n2 : ");
            int n2 = sc.nextInt();
            int[][] array = new int[n1][n2];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < n2; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            for (int j = 0; j < n2; j++) {
                int sum = 0;
                for (int i = 0; i < n1; i++)
                {
                    sum += array[i][j];
                }
                System.out.println(sum);
            }
        }
}
