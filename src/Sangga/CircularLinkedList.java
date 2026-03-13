package Sangga;

import Danosos.*;

public class CircularLinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // --- TRAVERSE ---
    public void traverse() {
        if (head == null) {
            return;
        }

        String output = "";
        String line = "";
        Node current = head;

        do {
            String localOutput = current.data + " -> ";
            output += localOutput;
            System.out.print(localOutput);
            current = current.next;
        } while (current.next != head);

        for (int i = 0; i < output.length() - 1; i++) {
            line += "_";
        }

        System.out.println(current.data + "\n|" + line + "|");
    }

    // --- INSERT AT BEGINNING ---
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    // --- INSERT AT END ---
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    // --- INSERT AT INDEX ---
    public void insertAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        } else if (index == size) {
            insertAtEnd(data);
            return;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    // --- DELETE ---
    public void delete(int data) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.data == data) {
                if (current == head) {
                    if (size == 1) {
                        head = null;
                        tail = null;
                    } else {
                        head = head.next;
                        tail.next = head;
                    }
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                        tail.next = head;
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println(data + " not fount in the list.");
    }

    // --- DELETE AT ---
    public void deleteAt(int position) {
        if (head == null || position < 0 || position >= size) {
            System.out.println("invalid position or empty list");
            return;
        }

        if (position == 0) {
            if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
            if (current == tail) {
                tail = previous;
                tail.next = head;
            }
        }
        size--;
    }

    // --- SIZE ---
    public int size() {
        return size;
    }
}
