package com.SiddhantBhatia.LinkedList;

public class CreateLinkedList {
    private Node head;
    private int size;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }
    public void insertAtPosition(int data, int position) {
        if (position <= 0 || position > size + 1) {
            System.out.println("Invalid Position!");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CreateLinkedList list = new CreateLinkedList();

        list.addFirst(56);
        list.addFirst(70);
        list.addFirst(60);

        System.out.println("Initial List:");
        list.display();

        list.insertAtPosition(54, 2);
        System.out.println("After inserting 54 at position 2:");
        list.display();

        list.addLast(100);
        System.out.println("After adding 100 at the end:");
        list.display();

        System.out.println("Size of the linked list: " + list.size());
    }
}
