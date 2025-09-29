package com.SiddhantBhatia.DAY_49;

public class StringAndCharArray {
    public static void main(String[] args) {
        String str = "DAKSH";
        char str2[] = {'D','A','K','S','H'};
        str2[0] = 'T';
        for(int i=0;i<5;i++){
            System.out.print(str2[i]);
        }
        System.out.println();
        System.out.println(str);
    }
}