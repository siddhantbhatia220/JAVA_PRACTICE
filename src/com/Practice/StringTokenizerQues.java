package Strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
