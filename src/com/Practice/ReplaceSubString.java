package Strings;

import java.util.Scanner;

public class ReplaceSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.nextLine();
        String news = sc.nextLine();
        StringBuffer sf = new StringBuffer(str);
        sf.replace(start,end,news);
        System.out.println(sf);
    }
}
