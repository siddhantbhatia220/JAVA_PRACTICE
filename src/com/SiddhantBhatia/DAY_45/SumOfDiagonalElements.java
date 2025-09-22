package com.SiddhantBhatia.DAY_45;

import java.util.Scanner;

public class SumOfDiagonalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num ;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
