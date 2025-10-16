package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Book4 {
    static String seller = "Amazon";
    String title;
    String author;

    Book4(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Seller: " + seller);
    }
}
public class  PRACTICE7 {
    public static void main(String[] args) {
        Book4 b1 = new Book4("Java Basics", "PULKIT");
        Book4 b2 = new Book4("Python Intro", "SIDDHANT");
        b1.display();
        b2.display();
        System.out.println("Access static directly: " + Book.seller);
        System.out.println("Access instance via object 1: " + b1.title);
        System.out.println("Access instance via object 2: " + b2.title);
}
}

