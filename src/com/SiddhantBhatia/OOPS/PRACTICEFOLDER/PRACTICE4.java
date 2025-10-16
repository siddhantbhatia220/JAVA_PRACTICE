package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Book {
    String otherName;
    String bookName;
    static String seller;

    Book(String otherName, String bookName) {
        this.otherName = otherName;
        this.bookName = bookName;
    }

    void display() {
        System.out.println("Book Name : " + bookName);
        System.out.println("Other Name : " + otherName);
        System.out.println("Seller : " + seller);
    }
}
public class PRACTICE4 {
    public static void main(String[] args) {
        Book.seller = "Amazon";
        Book b1 = new Book("BASIC", "Java");
        Book b2 = new Book("ADVANCED", "Java2");
        b1.display();
        b2.display();
    }
}
