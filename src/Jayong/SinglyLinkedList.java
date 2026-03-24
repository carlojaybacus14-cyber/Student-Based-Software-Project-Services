package Jayong;

public class SinglyLinkedList {

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // --- DISPLAY VALUES ---
    public String printList() {
        if (size == 0) {
            return "List is empty.";
        }
        
        Node current = head;
        String txtContainer = "";
        
        while (current != null) {
            txtContainer += current.data + " -> ";
            current = current.next;
        }
        return txtContainer += "null";
    }

    // --- INSERT AT BEGINNING ---
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // --- INSERT AT END ---
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }

    // --- INSERT AFTER ---
    public void insertAfter(int prevData, int data) {
        
        Node prevNode = head;
        
        while (prevNode.data != prevData) {
            prevNode = prevNode.next;
        }
        
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    // --- DELETE BY VALUE ---
    public void deleteByValue(int value) {

        Node current = head;
        Node previous = null;

        if (current != null && current.data == value) {
            head = current.next;
            size--;
            return;
        }

        while (current != null && current.data != value) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
        size--;
    }

    // --- DELETE BY POSITION ---
    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        Node current = head;
        if (index == 0) {
            head = current.next;
            size--;
            return;
        }

        for (int i = 0; current.next != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return;
        }

        Node next = current.next.next;
        current.next = next;
        size--;
    }

    // --- DELETE AT BEGINNING ---
    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    // --- DELETE AT END ---
    public void deleteAtEnd() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // --- GET NODE AT ---
    public Node getNodeAtIndex(int index) {
        Node current = head;
        for (int i = 0; current != null && i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Node getNodeByValueOf(int value) {
        Node current = head;
        while (current != null && current.data != value) {
            current = current.next;
        }
        return current;
    }
    
    public void clear() {
        head = null;
    }

    // --- SIZE ---
    public int size() {
        return size;
    }
}
