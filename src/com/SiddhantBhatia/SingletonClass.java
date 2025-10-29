package com.SiddhantBhatia.PracticeQues;

public class SingletonClass{
    private static SingletonClass instance;
    private SingletonClass() {}
    public static SingletonClass getInstance() {
        if (instance == null)
            instance = new SingletonClass();
        return instance;
    }
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s1 == s2);
    }
}
