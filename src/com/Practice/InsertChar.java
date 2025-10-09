package Strings;

import java.util.Scanner;
import java.util.Scanner;

public class InsertChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.insert(5," ");
        System.out.println(sb);
    }
}

