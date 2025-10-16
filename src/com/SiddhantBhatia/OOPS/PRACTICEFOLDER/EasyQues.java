package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Student{
    String name;
    int rollnumber;
    int marks;
    static int totalStudents;
    Student(String name,int rollnumber,int marks){
        this.name = name;
        this.rollnumber= rollnumber;
        this.marks = marks;
        totalStudents++;
    }
    char calculategrade(){
        if (marks>=90){
            return 'A';
        } else if (marks>=75&&marks<90) {
            return 'B';
        } else if (marks>=50&&marks<75) {
            return 'C';
        }
        else {
            return 'F';
        }

    }
    void display(){
        System.out.println("Name : " + " " + name);
        System.out.println("Roll Number : "+" "+rollnumber);
        System.out.println("Marks : "+" "+marks);
    }
}
public class EasyQues {
    public static void main(String[] args) {
        Student s1 = new Student("Pulkit",663,99);
        s1.display();
        System.out.println("Grade :"+" "+s1.calculategrade());;
        System.out.println();
        Student s2 = new Student("Rizzzzul",688,95);
        s2.display();
        System.out.println("Grade :"+" "+s2.calculategrade());;
    }
}
