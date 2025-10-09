package com.SiddhantBhatia.DAY_54;

import java.util.Scanner;

class Car {
    private String brand;
    String color;
    String engine;
    int price;
    int make;

    public Car(String brand, String color, String engine, int price, int make) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
        this.price = price;
        this.make = make;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Engine : " + engine);
        System.out.println("Price : " + price);
        System.out.println("Make Year : " + make);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter Car Color: ");
        String color = sc.nextLine();
        System.out.print("Enter Car Engine Type : ");
        String engine = sc.nextLine();
        System.out.print("Enter Car Price : ");
        int price = sc.nextInt();
        System.out.print("Enter Car Make Year : ");
        int make = sc.nextInt();
        Car C1 = new Car(brand, color, engine, price, make);
        C1.displayDetails();
    }
}
