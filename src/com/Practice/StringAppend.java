package Strings;

import java.util.Scanner;

public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.append(" ").append("is").append(" ").append("Learning");
        System.out.println(sb);
    }
}
