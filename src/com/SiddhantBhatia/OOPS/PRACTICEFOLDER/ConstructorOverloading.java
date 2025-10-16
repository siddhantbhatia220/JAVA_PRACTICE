package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Books {
    String title;
    String author;
    int pageCount;

    public Books() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.pageCount = 0;
    }

    public Books(String title) {
        this.title = title;
        this.author = "Anonymous";
        this.pageCount = 0;
    }

    public Books(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pageCount);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Books book1 = new Books();
        Books book2 = new Books("The Hobbit");
        Books book3 = new Books("Dune", "Frank Herbert", 412);

        book1.display();
        book2.display();
        book3.display();
    }
}