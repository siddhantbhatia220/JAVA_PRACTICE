package com.SiddhantBhatia.LinkedList;

public class InsertNode {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(7);

        System.out.print("Original List: ");
        printList(head);

        Node newNode = new Node(10);
        newNode.next = head;
        head = newNode;

        System.out.print("\nAfter inserting 10 at head: ");
        printList(head);
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
