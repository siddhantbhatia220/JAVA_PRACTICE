package com.PulkitBajaj.Strings;

public class StringBuilderInStrings {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder("hello");
        str.append("world");
        System.out.println(str);
        str.setCharAt(3,'p');
        System.out.println(str);
        str.append(" xyz");
        System.out.println(str);
        str.insert(3,'y');
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(6,8);
        System.out.println(str);
    }
}
