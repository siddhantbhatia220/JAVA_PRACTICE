package com.PulkitBajaj.Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountTokens{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("Number of tokens: " + st.countTokens());
    }
}

