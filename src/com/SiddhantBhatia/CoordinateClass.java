package com.SiddhantBhatia.PracticeQues;

final class CoordinateClass {
    int x;
    int y;
    CoordinateClass(int x, int y){
        this.x = x;
        this.y = y;
    }
    CoordinateClass(CoordinateClass other){
        this.x = other.x;
        this.y = other.y;
    }
    void get(){
        System.out.println("The Value of x is : " + x);
        System.out.println("The Value of y is : " + y);
    }
    public static void main(String[] args) {
        CoordinateClass cc = new CoordinateClass(5,9);
        CoordinateClass hi = new CoordinateClass(cc);
        cc.get();
        hi.get();
    }
}