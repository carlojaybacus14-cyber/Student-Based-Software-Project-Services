package Finished.Florentino;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // --- PRINT LIST ---
    public String printList() {
        if (head == null) {
            return "List is empty.";
        }
        
        Node current = head;
        
        String strContainer = "";
        while (current.next != null) {
            strContainer += current.data + " <-> ";
            current = current.next;
        }
        
        return strContainer += current.data + " <-> null\n";
    }

    // --- DISPLAY FORWARD ---
    public void displayForward() {

        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Doubly Linked List (forward):");
        System.out.print("null <- ");
        while (current.next != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println(current.data + " -> null");
    }

    // --- DISPLAY BACKWARD ---
    public void displayBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Douly Linked List (backward):");
        System.out.print("null <- ");
        while (current.prev != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println(current.data + " -> null");
    }

    // --- INSERT AT BEGINNING ---
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    // --- INSERT AT END ---
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        size++;
        
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    
    // --- INSERT AFTER ---
    public void insertAfter(int prevData, int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot insert.");
            return;
        }
        
        Node current = head;
        while (current != null) {
            if (current.data == prevData) {
                Node newNode = new Node(data);
                newNode.prev = current;
                newNode.next = current.next;
                
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data " + prevData + " not found.");
    }
    
    // --- DELETE DATA ---
    public void deleteData(int data) {
        Node current = head;
        
        if (head == null) {
            return;
        }
        
        if (head.data == data) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return;
        }
        
        while (current != null) {
            if (current.data == data) {
                if (current.next == null) {
                    tail = current.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println(data + " not found in the list.");
    }
    
    // --- DELETE AT INDEX ---
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size || head == null) {
            System.out.println("Invalid position or empty list");
        }
        
        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            
            if (current.next == null) {
                tail = current.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }
    
    // --- SIZE ---
    public int size() {
        return size;
    }
}
