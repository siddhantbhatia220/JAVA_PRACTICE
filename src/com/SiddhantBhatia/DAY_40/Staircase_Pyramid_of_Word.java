package com.SiddhantBhatia.DAY_40;

import java.util.Scanner;
public class Staircase_Pyramid_of_Word {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter a word : ");
                String word = in.nextLine();
                int len = word.length();
                for (int i = 0; i < len; i++) {
                    for (int j = i; j < len; j++) {
                        char ch = word.charAt(j);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
            }
        }

