package com.SiddhantBhatia.PracticeQues;

public class StudentClass {
    private String name;
    private int rollNumber;

    StudentClass() {
        System.out.println("This is the Student class .");
    }

    StudentClass(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    StudentClass(StudentClass s) {
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }

    void get() {
        System.out.println("Name: " + name + " RollNo: " + rollNumber);
    }

    public static void main(String[] args) {
        StudentClass s1 = new StudentClass();
        System.out.println("This is default constructor!");

        StudentClass s2 = new StudentClass("Siddhant", 713);
        s2.get();
        System.out.println("This is Parameterized Constructor!");

        StudentClass s3 = new StudentClass(s2);
        s3.get();
        System.out.println("This is Copy Constructor!");
    }
}