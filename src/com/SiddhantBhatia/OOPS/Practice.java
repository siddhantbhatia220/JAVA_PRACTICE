package com.SiddhantBhatia.OOPS;

import java.util.Scanner;

class Vehicle{
    String brand;
    int make;
    public Vehicle(String brand,int make){
        this.brand = brand;
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle [Brand=" + brand + ", Make=" + make + "]";
    }
}
public class Practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Car Brand: ");
//        String brand = sc.nextLine();
//        System.out.print("Enter Car Make : ");
//        String make = sc.nextLine();

        Vehicle vh  = new Vehicle("BMW" , 2025);
        System.out.println(vh.brand  + vh.make);

        System.out.println(vh.toString());
    }
}
