package com.SiddhantBhatia.DAY_44;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n)
    {
        if (n == 0||n==1)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++)
        {
            System.out.println(fib(i));
        }
    }
}
