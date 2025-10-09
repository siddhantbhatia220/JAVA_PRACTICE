package Strings;

import java.util.Scanner;

public class DeleteChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.delete(3,5);
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
