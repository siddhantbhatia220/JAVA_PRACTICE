package com.SiddhantBhatia.DAY_44;

import java.util.Scanner;

public class Factorial{
    static int fac(int n)
    {
        if (n == 0||n==1)
        {
            return 1;
        }
        return fac(n-1)*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));

    }
}
