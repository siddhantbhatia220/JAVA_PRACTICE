package Strings;

import java.util.Scanner;

public class PalindromeCheck {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(rev));
    }
}
