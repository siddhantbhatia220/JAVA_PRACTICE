package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Book2 {
    String otherName;
    String bookName;
    static String seller;

    Book2(String otherName, String bookName) {
        this.otherName = otherName;
        this.bookName = bookName;
    }
    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Other Name: " + otherName);
        System.out.println("Seller: " + seller);
    }
}

class BookStore {
    void showSeller() {
        System.out.println("Seller (Accessed in BookStore): " + Book.seller);
    }
}
public class PRACTICE5 {
    public static void main(String[] args) {
        Book.seller = "Amazon";
        Book b1 = new Book("Basics", "Java");
        Book b2 = new Book("Advanced", "Java2");
        b1.display();
        b2.display();
        BookStore store = new BookStore();
        store.showSeller();
    }
}
