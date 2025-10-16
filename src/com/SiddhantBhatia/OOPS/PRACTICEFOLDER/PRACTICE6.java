package com.SiddhantBhatia.OOPS.PRACTICEFOLDER;

class Book3 {
    static int total_books;
    String title;

    Book3(String title) {
         this.title = title;
          total_books++;
        }
        void display() {
            System.out.println("Title: " + title);
        }
    }
    public class PRACTICE6 {
        public static void main(String[] args) {
            Book3 b1 = new Book3("Java");
            Book3 b2 = new Book3("Python");
            b1.display();
            b2.display();
            System.out.println("Total Books : " + Book3.total_books);
        }
    }