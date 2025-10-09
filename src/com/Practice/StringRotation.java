package Strings;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        String left = str.substring(n)+str.substring(0,n);
        String right = str.substring(str.length()-1)+str.substring(0,str.length()-1);
        System.out.println("Left Rotation: " + left);
        System.out.println("Right Rotation: " + right);
    }
}
