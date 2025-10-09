package com.SiddhantBhatia.DAY_52;

// What is the difference between private and public access modifiers? Write a code snippet to show how a private field can't be accessed outside its class
    class Student {
        private int rollNo;   // private member
        public String name;   // public member

        // public method to set private value
        public void setRollNo(int r) {
            rollNo = r;
        }

        // public method to display data
        public void show() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
        }
    }

    public class PrivateAccessCheck {
        public static void main(String[] args) {
            Student s1 = new Student();

            s1.show();
        }
    }


