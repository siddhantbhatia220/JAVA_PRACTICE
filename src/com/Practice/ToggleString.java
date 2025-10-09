package Strings;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < str.length(); i++) {
            char c = sb.charAt(i);
            if(Character.isUpperCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }

        System.out.println(sb);
        sc.close();
    }
}
