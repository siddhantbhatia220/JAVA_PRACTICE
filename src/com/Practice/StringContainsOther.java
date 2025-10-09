package Strings;

import java.util.Scanner;

public class StringContainsOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println((str1.length()==str2.length())&&(str1+str1).contains(str2));
    }
}
