package com.SiddhantBhatia.DAY_49;

//public class VowelReplacementString {
//    public static void main(String[] args) {
//        String str = new String("DAKSH");
//        String result = "";
//        for (int i = 0; i<str.length();i++)
//        {
//            char ch = str.charAt(i);
//            if ("aeiouAEIOU".indexOf(ch) != -1) {
//                result += '*';
//            } else {
//                result += ch;
//            }
//        }
//        System.out.println(result);
//    }
//}


import java.util.Scanner;

public class VowelReplacementString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch =='U'){
                result = result + '*';
            }
            else{
                result = result + ch;
            }
        }
        System.out.println(result);
}
}