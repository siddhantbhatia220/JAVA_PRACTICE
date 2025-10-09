package Strings;

import java.util.Scanner;

public class PalindromeSubString {
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length(),count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(isPalindrome(s.substring(i,j))==true){
                    count++;
                    System.out.print(s.substring(i,j)+" ");
                }
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
