package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

public class PRACTICE3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        int count = 0;
        for (int num : arr) {
           if (num % 2 == 0){
                count++;
            }
        }
        System.out.println("Number of even digits : " + count);
    }
}
