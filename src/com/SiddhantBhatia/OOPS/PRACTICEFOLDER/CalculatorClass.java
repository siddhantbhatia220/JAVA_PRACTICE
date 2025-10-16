package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Calculator1{
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        Calculator1 calc = new Calculator1();
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7));
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!"));
    }
}


