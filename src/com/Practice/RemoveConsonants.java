package com.PulkitBajaj.Strings;

import java.util.Scanner;

public class RemoveConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
                result += "";
            } else {
                result += ch;
            }
        }
        System.out.print(result);
    }
}
